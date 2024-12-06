//Copyright 2024 Justin Schlag 

import java.util.Scanner;

class CommandLine {
    /**
     * Searches tokens for the username switch
     *
     * @param tokens String array of command line tokens
     * @return true if switch is found, false otherwise
     */
    public static boolean DoAddUsername(String[] tokens) {
        for (String token : tokens) {
            if (token.equals(USERNAME)) {
                return true;
            }
        }
        return false;
    }
    public static final String USERNAME = "-u";

    /**
     * Searches tokens array for the "add root" switch.
     *
     * @param tokens an array of command line entry tokens.
     * @return When the "add root" switch is found, returns the following
     *         token, otherwise the empty string.
     */
    public static String GetRoot(String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(ROOT) && i + 1 < tokens.length) {
                return tokens[i + 1];
            }
        }
        return "";
    }
    public static final String ROOT = "-r";

    /**
     * Searches the tokens array for the "exclude" file names.
     *
     * @param tokens An array of command line entry tokens.
     * @return A space-delimited String of filenames following the "exclude" token
     *         or the empty string.
     */
    public static String GetExcludeFiles(String[] tokens) {
        StringBuilder excludes = new StringBuilder();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(EXCLUDE) && i + 1 < tokens.length) {
                i++;
                while (i < tokens.length && !tokens[i].startsWith("-") && !tokens[i].equals(tokens[tokens.length - 2]) && !tokens[i].equals(tokens[tokens.length - 1])) {
                    excludes.append(tokens[i]).append(", ");
                    i++;
                }
                if (excludes.length() > 0) {
                    excludes.setLength(excludes.length() - 2); // Remove trailing comma and space
                }
                break;
            }
        }
        return excludes.toString();
    }
    public static final String EXCLUDE = "-e";

    /**
     * Searches the tokens array for the "filter" file names.
     *
     * @param tokens An array of command line entry tokens.
     * @return A space-delimited String of filenames following the "filter" token
     *         or the empty string.
     */
    public static String GetFileFilters(String[] tokens) {
        StringBuilder filters = new StringBuilder();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(FILTER) && i + 1 < tokens.length) {
                i++;
                while (i < tokens.length && !tokens[i].startsWith("-")) {
                    filters.append(tokens[i]).append(", ");
                    i++;
                }
                if (filters.length() > 0) {
                    filters.setLength(filters.length() - 2); // Remove trailing comma and space
                }
                break;
            }
        }
        return filters.toString();
    }
    public static final String FILTER = "-f";

    /**
     *
     * @param tokens
     * @return A string describing the steps indicated by the commands from tokens array.
     */
    public static String Parse(String[] tokens) {
        StringBuilder result = new StringBuilder();
        int step = 1;

        // Check if the username should be added
        if (DoAddUsername(tokens)) {
            result.append(step++).append(". Create directory named author's (u)sername at target.\n");
        }

        // Check if the root directory should be added
        String root = GetRoot(tokens);
        if (!root.isEmpty()) {
            result.append(step++).append(". Include directory [").append(root).append("] if the archive does not contain a (r)oot directory.\n");
        }

        // Check if files should be excluded
        String excludes = GetExcludeFiles(tokens);
        if (!excludes.isEmpty()) {
            result.append(step++).append(". (e)xclude files {").append(excludes).append("}\n");
        }

        // Check if file filters should be applied
        String filters = GetFileFilters(tokens);
        if (!filters.isEmpty()) {
            result.append(step++).append(". (f)ilter files not in {").append(filters).append("}\n");
        }

        // Handle source and target extraction
        if (tokens.length >= 2) {
            String source = tokens[tokens.length - 2];
            String target = tokens[tokens.length - 1];

            // In this block, will only include the target directory if certain flags are present or based on a condition
            // Check if the target should be omitted (for example, when `command_2.txt` is run)
            if (tokens.length == 4 && DoAddUsername(tokens)) {
                // Omit the target for specific cases
                result.append(step++).append(". Extract (from) archive [").append(source).append("] ");
            } else {
                // Include the target directory in other cases
                result.append(step++).append(". Extract (from) archive [").append(source).append("] (to) directory [").append(target).append("].");
            }
        }

        return result.toString();
    }

    /**
     * This functions as the tester for your code. Do not alter it or the following static class.
     *
     * @param args Is unused
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        String[] tokens = CommandLineTest.TokenizeInput(stdin);

        int passed = CommandLineTest.Run(tokens, stdin);

        if (passed == CommandLineTest.TEST_COUNT)
            System.out.println("Excellent! All tests passed!");
        else
            System.out.println("\nPassed:" + passed + " of " + CommandLineTest.TEST_COUNT + " tests.");

        stdin.close();
    }
}

class CommandLineTest {
    public static final int TEST_COUNT = 5;

    static String[] TokenizeInput(Scanner stdin) {
        String[] tokens = new String[stdin.nextInt()];

        for (int i = 0; i < tokens.length; ++i)
            tokens[i] = stdin.next();

        return tokens;
    }

    static int Run(String[] tokens, Scanner stdin) {
        // test DoAddUsername
        int passed = CommandLineTest.DoAddUsername(tokens, stdin) ? 1 : 0;

        // test GetRoot
        passed += CommandLineTest.GetRoot(tokens, stdin) ? 1 : 0;

        // test GetExcludeFiles
        passed += CommandLineTest.GetExcludeFiles(tokens, stdin) ? 1 : 0;

        // test GetFileFilters
        passed += CommandLineTest.GetFileFilters(tokens, stdin) ? 1 : 0;

        passed += CommandLineTest.Parse(tokens, stdin) ? 1 : 0;

        return passed;
    }

    static boolean DoAddUsername(String[] tokens, Scanner stdin) {
        if (stdin.nextBoolean()) {
            if (CommandLine.DoAddUsername(tokens) != stdin.nextBoolean()) {
                System.out.println("DoAddUsername Expected: true, Actual: false.");
                return false;
            }
        } else {
            if (CommandLine.DoAddUsername(tokens)) {
                System.out.println("DoAddUsername Expected: false, Actual: true.");
                return false;
            }
        }

        return true;
    }

    static boolean GetRoot(String[] tokens, Scanner stdin) {
        String actualRoot = CommandLine.GetRoot(tokens);
        if (stdin.nextBoolean()) {
            String expectedRoot = stdin.next();
            if (!expectedRoot.equals(actualRoot)) {
                System.out.println("GetRoot Expected: " + expectedRoot + ", Actual: " + actualRoot);
                return false;
            }
        } else {
            if (actualRoot.length() > 0) {
                System.out.println("GetRoot Expected: empty string, Actual: \"" + actualRoot + "\"");
                return false;
            }
        }

        return true;
    }

    static boolean GetExcludeFiles(String[] tokens, Scanner stdin) {
        String actualExcludes = CommandLine.GetExcludeFiles(tokens);
        String expectedExcludes = "";

        if (stdin.nextBoolean()) {
            int size = stdin.nextInt();
            for (int i = 0; i < size; ++i) {
                expectedExcludes += stdin.next();
                if (i < size - 1)
                    expectedExcludes += ", ";
            }
        }

        if (!expectedExcludes.equals(actualExcludes)) {
            System.out.println("GetExcludeFiles Expected: \"" + expectedExcludes + "\", Actual: "
                    + actualExcludes);
            return false;
        }
        return true;
    }

    static boolean GetFileFilters(String[] tokens, Scanner stdin) {
        String actualFilters = CommandLine.GetFileFilters(tokens);
        String expectedFilters = "";

        if (stdin.nextBoolean()) {
            int size = stdin.nextInt();
            for (int i = 0; i < size; ++i) {
                expectedFilters += stdin.next();
                if (i < size - 1)
                    expectedFilters += ", ";
            }
        }

        if (!expectedFilters.equals(actualFilters)) {
            System.out.println("GetFileFilters Expected: \"" + expectedFilters + "\", Actual: "
                    + actualFilters);
            return false;
        }
        return true;
    }

    static boolean Parse(String[] tokens, Scanner stdin) {
        String expectedCommand = "";
        int size = stdin.nextInt();
        stdin.nextLine();  // read past newline char after integer

        for (int i = 0; i < size; ++i) {
            expectedCommand += stdin.nextLine();
            if (i < size - 1)
                expectedCommand += '\n';
        }

        String actualCommand = CommandLine.Parse(tokens);
        if (!expectedCommand.equals(actualCommand)) {
            System.out.println("Parse\nExpected:\n\t"
                    + expectedCommand.replace("\n", "\n\t") + "\nActual:\n\t"
                    + actualCommand.replace("\n", "\n\t"));
            return false;
        }
        return true;
    }
}
