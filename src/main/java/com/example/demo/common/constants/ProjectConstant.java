package com.example.demo.common.constants;

public class ProjectConstant {

    public static class Flag {
        public static final String Y = "Y";
        public static final String N = "N";
    }

    public static class ResponseMessage {
        public static final String SUCCESS = "SUCCESS";
        public static final String FAILED = "FAILED";

        public static class Delete{
            public static final String SUCCESS = "Deleted successfully";
            public static final String FAILED = "Failed to delete";
        }
        public static class Save{
            public static final String SUCCESS = "Save successfully";
            public static final String FAILED = "Unsuccessful recording";
        }
        public static class Upload{
            public static final String SUCCESS = "Uploaded successfully";
            public static final String FAILED = "Unsuccessful upload";
        }
    }

    public static class ResponseStatus {
        public static final String SUCCESS = "SUCCESS";
        public static final String FAILED = "FAILED";
    }

    public static class Error {
        public static final String _403 = "403";
        public static final String _500 = "500";
        public static final String REPEAT_USERNAME = "repeat user name";
    }
}
