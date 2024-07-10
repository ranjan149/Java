package org.example.exceptionhandling;

public class UncheckedException {

    private String str;

    public void readListOfString(){
        String[] strings = {"a", "b", "c"};
        try{
            System.out.println(strings[4]);
        } catch (Exception e){
            System.out.println("Error Occurred");
        }
    }

    public void readStringTest(){
        try{
            String[] strings = {"a", "b", "c"};
            System.out.println(strings[4]);
            int lengthOfString = str.length();
        } catch (NullPointerException e) {
            System.out.println("Error Occurred");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Another Error Occurred");
        } catch (RuntimeException e){
            System.out.println("RuntimeException Occurred");
        } catch (Exception e){
            System.out.println("Exception Occurred");
        } catch (Throwable e){
            System.out.println("Throwable Occurred");
        }
    }

    public void readAnotherTestString() throws Exception {
        String str = null;
        System.out.println(str.length());
    }

    public String getStringLengthGreaterThanFive(String str){
       if(str.length() > 5){
           return str;
       } else {
           throw new CustomException("String length is not greater than 5");
       }
    }

    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        String result = uncheckedException.getStringLengthGreaterThanFive("HELL");
        //System.out.println(result);
        try{
            uncheckedException.readAnotherTestString();
        } catch (Exception e){
            System.out.println("Error Occurred");
        }
    }
}
