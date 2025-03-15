class QuickSort
{
    public static void quickSort(int p, int q, int vetor[])
    {
        int x;
        if(p<q)
        {
            x = particao(p,q,vetor);
            quickSort(p,x-1,vetor);
            quickSort(x+1,q,vetor);
        }
    }
    
    public static int particao(int p, int q, int vetor[])
    {
        int j=p-1;
        int temp, aux = vetor[q];
        for(int i=p;i<=q;i++)
        {
            if(vetor[i]<=aux)
            {
                j++;
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        return j;
    }
    
    public static void main(String entrada[])
    {
        int i, vet[]={12,5,-3,4,0,21,8,-7,9,6};
        
        /*
        //Here I used the parameter q and limit of for, with known quantity of data.
        quickSort(0,9,vet);
        for(i =0; i<10;i++)
        */
                
        quickSort(0,(vet.length-1),vet);
        for(i =0; i<vet.length;i++)
        {
            System.out.print(vet[i] + " ");
        }
        System.exit(0);
    }
}