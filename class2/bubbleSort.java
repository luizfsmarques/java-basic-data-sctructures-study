class BubbleSort{
    
    public static int [] bolha (int numeros[])
    {
        final int n = numeros.length;
        int aux;
        
        for(int i=0;i<(n-1);i++)
        {
            for(int j=0;j<(n-1-i);j++){
                if(numeros[j]>numeros[j+1])
                {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
          
        return numeros;
    }
    
    public static void main(String entrada[])
    {
        //int i, vet[]={9,5,1,3,10,8,4,6,7,2};
        int i, vet[]={9,5,1,3,10,8,4,6,7,2,34,22,12,32,44,55,67,78,75,54};
        
            
        vet = bolha(vet);
        
        /*
        This for is used for a known quantity of data at the vector. 
        for(i=0;i<10;i++)
        */
        for(i=0;i<vet.length;i++)
        {
           System.out .print(vet[i]+ " ");
        }    
        
        System.exit(0);
    }
    
}