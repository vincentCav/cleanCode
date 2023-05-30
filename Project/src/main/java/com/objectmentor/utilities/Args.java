package com.objectmentor.utilities;
// Listing 14-9: Boolean only from clean code

import java.util.*;

public class Args {
    private String schema;
    private String[] args;
    private boolean valid;
    private Set<Character> unexpectedArguments = new TreeSet<Character>();
    private Map<Character, Boolean> booleanArgs = new HashMap<Character, Boolean>();
    private int numberOfArguments = 0;

    public Args(String schema, String[] args) {
        this.schema = schema;
        this.args = args;
        valid = parse();
    }

    public boolean isValid() {
        return valid;
    }

    private boolean parse() {
        if (schema.length() == 0 && args.length == 0)
            return true;
        parseSchema();
        parseArguments();
        return unexpectedArguments.size() == 0;
    }

    private boolean parseSchema() {
        for (String element : schema.split(",")) {
            parseSchemaElement(element);
        }
        return true;
    }

    private void parseSchemaElement(String element) {

    }

    private void parseBooleanSchemaElement(String element) {

    }

    private boolean parseArguments() {
        return false;
    }

    private void parseArgument(String arg) {

    }

    private void parseElements(String arg) {

    }

    private void parseElement(char argChar) {

    }

    private void setBooleanArg(char argChar, boolean value) {

    }

    private boolean isBoolean(char argChar) {
        return false;
    }

    public int cardinality() {
        return 0;
    }

    public String usage() {
        return "";
    }

    public String errorMessage() {
        return "";
    }

    private String unexpectedArgumentMessage() {
        return "";
    }

    public boolean getBoolean(char arg) {
        return false;
    }
}