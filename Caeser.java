import javax.crypto.Cipher;
import java.util.Scanner;

public class Caeser
{
    /*public static String encrypt( String plainText, int shift)
    {
        if(shift>26)
        {
            shift = shift%26;
        }
        else if(shift<0)
        {
            shift = (shift%26)+26;
        }

        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i< length; i++)
        {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch))
            {
                if (Character.isLowerCase(ch))
                {
                    //c becomes shifted character
                    char c = (char)(ch+shift);
                    //if out of bounds
                    if(c>'z')
                    {
                        cipherText += (char)(ch - (26 - shift));
                    }
                    else
                    {
                        cipherText += c;
                    }
                }
                else if (Character.isUpperCase(ch))
                {
                    //c becomes shifted character
                    char c = (char)(ch+shift);
                    //if out of bounds
                    if(c>'Z')
                    {
                        cipherText += (char)(ch - (26 - shift));
                    }
                    else
                    {
                        cipherText += c;
                    }

                }
            }
            else
            {
                cipherText += ch;
            }
        }

        return cipherText;
    }*/


    public static String decrypt( String plainText, int shift)
    {
        if(shift>26)
        {
            shift = shift%26;
        }
        else if(shift<0)
        {
            shift = (shift%26)+26;
        }

        String cipherText = "";
        int length = plainText.length();
        for (int i = 0; i< length; i++)
        {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch))
            {
                if (Character.isLowerCase(ch))
                {
                    //c becomes shifted character
                    char c = (char)(ch-shift);
                    //if out of bounds
                    if(c < 'a')
                    {
                        cipherText += (char)(ch + (26 - shift));
                    }
                    else
                    {
                        cipherText += c;
                    }
                }
                else if (Character.isUpperCase(ch))
                {
                    //c becomes shifted character
                    char c = (char)(ch-shift);
                    //if out of bounds
                    if(c< 'A')
                    {
                        cipherText += (char)(ch + (26 - shift));
                    }
                    else
                    {
                        cipherText += c;
                    }

                }
            }
            else
            {
                cipherText += ch;
            }
        }

        return cipherText;
    }


    public static void main ( String[] args )
    {
        //String text = "This is some message";



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shift: ");
        int shift=sc.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter encrypted mesg:\n");
        String cipher=scan.nextLine();


       /* String cipher = ("RQH YDULDWLRQ WR WKH VWDQGDUG FDHVDU FLSKHU LV ZKHQ\n" +
                "WKH DOSKDEHW LV \"NHBHG\" EB XVLQJ D ZRUG. LQ WKH\n" +
                "WUDGLWLRQDO YDULHWB, RQH FRXOG ZULWH WKH DOSKDEHW RQ\n" +
                "WZR VWULSV DQG MXVW PDWFK XS WKH VWULSV DIWHU VOLGLQJ\n" +
                "WKH ERWWRP VWULS WR WKH OHIW RU ULJKW. WR HQFRGH, BRX\n" +
                "ZRXOG ILQG D OHWWHU LQ WKH WRS URZ DQG VXEVWLWXWH LW\n" +
                "IRU WKH OHWWHU LQ WKH ERWWRP URZ. IRU D NHBHG YHUVLRQ,\n" +
                "RQH ZRXOG QRW XVH D VWDQGDUG DOSKDEHW, EXW ZRXOG ILUVW\n" +
                "ZULWH D ZRUG (RPLWWLQJ GXSOLFDWHG OHWWHUV) DQG WKHQ\n" +
                "ZULWH WKH UHPDLQLQJ OHWWHUV RI WKH DOSKDEHW. IRU WKH\n" +
                "HADPSOH EHORZ, L XVHG D NHB RI \"UXPNLQ.FRP\" DQG BRX ZLOO VHH\n" +
                "WKDW WKH SHULRG LV UHPRYHG EHFDXVH LW LV QRW D OHWWHU.\n" +
                "BRX ZLOO DOVR QRWLFH WKH VHFRQG \"P\" LV QRW LQFOXGHG\n" +
                "EHFDXVH WKHUH ZDV DQ P DOUHDGB DQG BRX FDQ'W KDYH\n" +
                "GXSOLFDWHV");*/
        System.out.println("\n Encrypted text is:\n" +cipher);

        String decrypted = decrypt(cipher, shift);
        System.out.println("\nDecrypted text is:\n" +decrypted);
    }



}


