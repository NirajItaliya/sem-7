package com.example.mad_npracticals.Practical_8;
public class MyDetail {


    private String fname; private String lname; private int age;
    public MyDetail(String fname, String lname,int age) { this.fname = fname;
        this.lname = lname;

        this.age=age;

    }



    public void setFname(String fname) { this.fname = fname;
    }


    public String getFname() { return fname;
    }


    public void setLname(String lname) { this.lname = lname;
    }


    public String getLname() { return lname;
    }


    public int getAge() { return age;
    }


    public void setAge(int age) { this.age = age;
    }

}
