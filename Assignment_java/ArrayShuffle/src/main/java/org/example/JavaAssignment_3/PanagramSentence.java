package org.example.JavaAssignment_3;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.HashSet;

public class PanagramSentence {
    public boolean Panagram(String str){
        HashSet<Character>hashSet=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!hashSet.contains(str.charAt(i)) && ((str.charAt(i)>='a' || str.charAt(i)<='z')
            ||(str.charAt(i)>='A'||str.charAt(i)<='Z'))){
                hashSet.add(str.charAt(i));
            }
        }
        if(hashSet.size()==26){
            return true;
        }
        return false;
    }
}
