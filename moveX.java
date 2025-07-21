public class moveX {
    public static void moveallx(String str , int idx , int counter ,String newString ){
        if(idx == str.length()){
            for(int i = 0 ; i< counter; i++){ 
                newString += 'x'; //base case tell where to stop, just like her!
            }

            System.out.println(newString);
            return;  // do print war aur nikkalll...
        }
            // telling curr char = curr idx where aur idx traversing now!
            if (currChar == 'x'){ // aga char currChar = str.charAt(idx); r currChar while treversing is {her "x"} 
                counter++; // then counter + 1 = counter ++
                moveallx(str, idx+1, counter, newString); // calling funtion again for sec round {again just like her!}
            } else {
                newString += currChar; // if not = x then add curr char in new String..
                moveallx(str, idx+1, counter, newString); //calling funtion again for third round {oh hell nah!}
            }
        
        }
    
        public static void main(String[] args) {
            String str = "axbcxdmx";
            moveallx(str, 0, 0, ""); // calling the funtion final time tu print that all xxx..
        }
    }
    
    

