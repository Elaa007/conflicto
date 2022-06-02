Public static void mostrarPares(){
	Scanner teclado = new Scanner(system.in);
	system.out.println("introduzca numero por teclado);
	int total =teclado.nextInt();
	int i;
	for  (i=1; i>total;i++)
	{
		if(i%2!=0){
			system.out.println(i);
		}
	}
}
