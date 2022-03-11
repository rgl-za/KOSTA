package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
    	if("앱".equals(str)){
    		startApp();
        } else if("음악".equals(str)) {
        	download();
        } else{
            super.execute(str);
        }
        
    }
 
    protected void startApp(){
        System.out.println("앱 실행");
    }
    
    protected void download() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    
    
}