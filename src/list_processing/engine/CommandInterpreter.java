package list_processing.engine;

import list_processing.ProjectConstants;
import list_processing.customList.CustomList;

public final class CommandInterpreter {
    public String interpret(String[] tokens, CustomList customList) {
        String command = tokens[0];
        boolean isValidIndex;

        switch (command) {
            case "append":
                if (tokens.length != 2)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                customList.append(tokens[1]);
                return customList.toString();
            case "prepend":
                if (tokens.length != 2)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                customList.prepend(tokens[1]);
                return customList.toString();
            case "reverse":
                if (tokens.length != 1)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                customList.reverse();
                return customList.toString();
            case "insert":
                if (tokens.length != 3)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                isValidIndex = validateIndex(tokens[1]);

                if (!isValidIndex)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                try {
                    customList.insert(Integer.valueOf(tokens[1]), tokens[2]);
                    return customList.toString();
                } catch (IndexOutOfBoundsException iobe) {
                    return iobe.getMessage();
                }
            case "delete":
                if (tokens.length != 2)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                isValidIndex = validateIndex(tokens[1]);

                if (!isValidIndex)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                try {
                    customList.delete(Integer.valueOf(tokens[1]));
                    return customList.toString();
                } catch (IndexOutOfBoundsException iobe) {
                    return iobe.getMessage();
                }
            case "roll":
                if (tokens.length != 2)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                switch (tokens[1]) {
                    case "left":
                        customList.rollLeft();
                        return customList.toString();
                    case "right":
                        customList.rollRight();
                        return customList.toString();
                    default:
                        return ProjectConstants.INVALID_COMMAND;
                }
            case "sort":
                if (tokens.length != 1)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                customList.sort();
                return customList.toString();
            case "count":
                if (tokens.length != 2)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                return String.valueOf(customList.count(tokens[1]));
            case "end":
                if (tokens.length != 1)
                    return ProjectConstants.INVALID_COMMAND_PARAMETERS;

                return "Finished";
            default:
                return ProjectConstants.INVALID_COMMAND;
        }
    }

    private boolean validateIndex(String token) {
        try {
            int index = Integer.valueOf(token);
            return true;
        }catch (NumberFormatException nfe){
            return false;
        }
    }
}
