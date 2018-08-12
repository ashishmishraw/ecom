package com.aranyacreations.ecom.exception;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse {


    private List<ErrorItem> errors = new ArrayList(10);

    public void addError(ErrorItem error) {
        this.errors.add(error);
    }

    public List<ErrorItem> getErrors() {
        return errors;
    }

    static class ErrorItem {
        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        private  String code;
        private String message;
        private String timestamp;
    }
}
