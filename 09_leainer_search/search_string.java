public class search_string {
    
    public static void main(String[] args) {
       String name  = "prem";
       char target = 'e';
       System.out.println(search(name, target));
    }

    //search in string
  static boolean search(String str, char  target){
    if(str.length()==0){
        return false;
    }
 for(char i =0;i<str.length();i++){
    if(target == str.charAt(i)){
      return true;
    }
 }
 return false;
  }

    //search in string using forech loop
  static boolean search1(String str, char  target){
    if(str.length()==0){
        return false;
    }
    for (char ch : str.toCharArray()) {//tochaeArray matalb ye string ko char array me convert kar dega
        if(ch==target){
            return true;
        }
    }
    return false;

}
}
    
    

