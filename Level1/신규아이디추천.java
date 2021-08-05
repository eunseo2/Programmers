public class 신규아이디추천 {
    public String solution(String new_id) {
        
        //대문자 -> 소문자
        new_id = new_id.toLowerCase();
        
        //소문자, 숫자, -, _, .를 제외한 모든 문자를 제거 
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        //마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        new_id = new_id.replaceAll("[.]{2,}",".");
        
        //마침표(.)가 처음이나 끝에 위치한다면 제거
        new_id = new_id.replaceAll("^[.]|[.]$", ""); 
        
        if(new_id.equals("")){
            new_id = "a";
        }
        
        if(new_id.length()>=16){
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("[.]$","");
        }
        
        if(new_id.length()<3){
            while(new_id.length()<3){
                new_id += new_id.charAt(new_id.length()-1);
            }
        }
    
        return new_id;
    } 
}
