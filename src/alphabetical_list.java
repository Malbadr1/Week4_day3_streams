import java.io.*;

public class alphabetical_list{



    public static void main(String args[]) throws IOException
    {

        try
        {
            FileReader fr = new FileReader("g://data");
            BufferedReader br = new BufferedReader(fr);
            String str;

            while((str = br.readLine()) != null)
                countwords(str);
            fr.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
        catch(IOException e)
        {
            System.out.println("Exception : " + e);
        }
    }

    static void countwords(String st)
    {
        int len,i,totwords=1,j=-1,k=0,freqarr[],temp;
        int cnt=0,flag=0;
        len = st.length();
        char ch[];
        String starr[],st1[];

        for(i=0;i<len-1;i++)
        {
            if(st.charAt(i) != ' ' && st.charAt(i+1) == ' ')
                totwords++;
        }

        starr = new String[totwords+1];
        freqarr = new int[totwords];
        st1 = new String[totwords];

        for(i=0;i<len-1;i++)
        {
            if(st.charAt(i) != ' ' && st.charAt(i+1) == ' ')
            {
                ch = new char[(i+1) - j];
                st.getChars(j+1,i+1,ch,0);
                starr[k++] = new String(ch);
                j = i+1;
            }
        }

        ch = new char[(i+1) - j];
        st.getChars(j+1,i+1,ch,0);
        starr[k] = new String(ch);
        k=0;

        for(i=0;i<totwords;i++)
        {
            temp = 1;
            flag = 0;
            for(j=i+1;j<=totwords;j++)
            {
                if(starr[i].equals(starr[j]))
                    temp++;
            }
            freqarr[k] = temp;

            for(cnt=0;cnt<k;cnt++)
            {
                if(starr[i].equals(st1[cnt]))
                    flag = 1;
            }
            if(flag == 0)
                st1[k++] = starr[i];
        }

        for(i=0;i<k;i++)
            System.out.println(st1[i] + "has count : " + freqarr[i]);
       
    }


}