using System;

namespace clase2
{
    class Program
    {
        static void Main(string[] args)  // nuesntro punto de inicio
        {
            Console.WriteLine("inicio del programa");

            saludarEspEng();

            Console.WriteLine("fin del programa");

        }

        static void saludarEspEng()
        {
            saludarEsp("hola soy argentino");

            saludarEng();
        }

        static void saludarEsp(string mensaje)
        {

            Console.WriteLine(mensaje.ToUpper());
        }


        static void saludarEng()
        {

            Console.WriteLine("Welcome to the summer house");

        }
    }
}
