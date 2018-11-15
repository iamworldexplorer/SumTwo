import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.io.*;

/**
 * Created by giraffissimo on 10/26/2018.
 *
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 *   You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 *       Example:
 *
 *          Given nums = [2, 7, 11, 15], target = 9,
 *
 *           Because nums[0] + nums[1] = 2 + 7 = 9,
 *           return [0, 1].
 */
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int search = 0;
        for(int i = 0; i < nums.length; i++){
                search = target - nums[i];
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[j] == search) {
                        result = new int[]{i, j};
                        return result;
                    }
                }
        }
        return result;
    }


    public static void main(String[] args) throws IOException, Base64DecodingException {

        //System.out.println();
        /*int[] nums = new int[]{3,2,95,4,-3};
        int target = 92;
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");*/

        File file = new File("D:\\Projects\\NextGen\\download.txt");
        try (FileInputStream fis = new FileInputStream(file)) {

            System.out.println("Total file size to read (in bytes) : "+ fis.available());
            StringBuffer str = new StringBuffer();
            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                //System.out.print((char) content);
                str.append((char)content);
            }

            FileOutputStream fos = new FileOutputStream("D:\\Projects\\NextGen\\download.pdf");
            fos.write(Base64.decode(str.toString()));
            fos.close();

            /*String encoded = null;
            try {
                byte[] bytes = pdfReader.getPageContent(1);
                encoded = Base64.encode(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }

            Init.init();
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream("D:\\Projects\\NextGen\\download.pdf");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            //Base64.decode(pdf, fos);
            try {
                fos.write(Base64.decode(encoded));//pageContentByte.toString();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Base64DecodingException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
