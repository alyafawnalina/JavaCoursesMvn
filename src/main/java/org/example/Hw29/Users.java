package org.example.Hw29;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {

    private int userId;
    private int id;
    private String title;
    private String completed;

}
