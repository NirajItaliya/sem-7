package com.example.mad_npracticals.Practical_6;

public class MyListData {
    private String name; private int imgId; private String add;
    public MyListData(String name, int imgId,String add) { this.name = name;
        this.imgId = imgId; this.add=add;
    }

    public String getName() {

        return name;

    }

    public void setName(String name) { this.name = name;
    }

    public int getImgId() { return imgId;
    }

    public void setImgId(int imgId) { this.imgId = imgId;
    }

    public String getAdd() { return add;
    }

    public void setAdd(String add) { this.add = add;
    }

}
