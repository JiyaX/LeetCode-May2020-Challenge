class Solution 
{
   public boolean isPerfectSquare(long num) 
   {
    if (num < 0)
    {
        return false;}
        if (num <= 1) {return true;}
        long i = 2;
        long j = num;
        while (i <= j) 
        {
            long  k = i + (j - i) / 2; // avoid integer overflow
            if (k * k == num) {return true;}
            if (k * k > num)
            {
                j = k - 1;
            } else
            {
                i = k + 1;
            }
        }
        return false;
    }
}

/* public boolean isPerfectSquare(int num) 
    {
        for(int i=1; i*i<=num; i++)
        {
            if(num%i==0 && num/i==i)
            {
                return true;
            }

        }
        return false;
    }
}*/
