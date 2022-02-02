package com.roy.design.composite;

public class JavaFile extends Component {

    public enum FileType {
        CLASS, ABSTRACT_CLASS, INTERFACE
    }

    private final FileType fileType;

    public JavaFile(FileType fileType, String name) {
        super(name);
        this.fileType = fileType;
    }

    public FileType getFileType() {
        return fileType;
    }
}
