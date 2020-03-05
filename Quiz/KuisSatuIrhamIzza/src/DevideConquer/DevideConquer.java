
package DevideConquer;
public class DevideConquer {
    static void towerOfHanoi(int n, char source, char destination, char spare) 
    { 
        if (n > 1) 
        { 
        towerOfHanoi(n-1, source, spare, destination); 
        System.out.println("Pindah Gelang " + n + " dari Tower " +  source + " ke Tower " + destination); 
        towerOfHanoi(n-1, spare, destination, source);            
        }else {           
         System.out.println("Pindah 1 Gelang dari Tower " +  source + " ke Tower " + destination); 
        } 
        
         
    } 
      
    public static void main(String args[]) 
    { 
        int n = 4; // Jumlah Gelang
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C adalah nama tower 
    } 
} 

