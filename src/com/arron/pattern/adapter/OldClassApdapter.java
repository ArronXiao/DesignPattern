package com.arron.pattern.adapter;

public class OldClassApdapter extends OldClass{

    Oldclass2 mOlaClass;
    
    public OldClassApdapter(Oldclass2 oldClass) {
        // TODO Auto-generated constructor stub
        mOlaClass = oldClass;
    }
    
    public String getOldName() {
        return mOlaClass.getOld();
    }
}
