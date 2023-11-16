package com.bob.Adaptee;

public class S20210440123_AVIDecoder implements S20210440123_Decoder{
    @Override
    public void decode(String filename) {
        String fileExtension = filename.substring(filename.lastIndexOf(".") + 1);
        if(fileExtension.equals("avi")){
            System.out.println("用AVI解码算法解码");
        }else {
            System.out.println("传入的文件类型和解码器不匹配！");
        }

    }
}
