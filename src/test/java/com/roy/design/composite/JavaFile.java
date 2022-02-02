package com.roy.design.composite;

public class JavaFile extends Component {
    public enum FileType {
        CLASS, ABSTRACT_CLASS, INTERFACE
    }
    private FileType fileType;
    private String sourceCode;
    public JavaFile(FileType fileType, String name) {
        super(name);
        this.fileType = fileType;
    }

    public FileType getFileType() {
        return fileType;
    }
}
