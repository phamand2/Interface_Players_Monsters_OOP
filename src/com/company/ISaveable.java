package com.company;

import java.util.List;

public interface ISaveable {
    // return an ArrayList
    List<String> write();
    // Output the values
    void read(List<String> savedValues);
}
