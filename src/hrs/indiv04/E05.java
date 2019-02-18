package hrs.indiv04;

import java.util.Scanner;

public class E05 {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        String texto = "El código\n"
                + "\n"
                + "Tengo la boca grande como un buzón. Media vida metido en el departamento de informática y aún me tengo que castigar el lomo yo mismo por lo inocente que soy. Pero no digo que tenga la boca grande por ser indiscreto, o faltón, que también; sino porque cada vez que me preguntan contesto con lo que yo sé que es verdad y no con lo que quieren escuchar. Ser honesto en la vida es una puta mierda.\n"
                + "\n"
                + "Suprakillminds depende enormemente de la buena marcha de una aplicación muy particular. La dichosa aplicación la usan muchos usuarios y ha de ser rápida, veloz y ligera cual gacela huyendo de un guepardo con hambre de seis días y zapatillas nuevas.\n"
                + "\n"
                + "Cuando compraron la aplicación, y maldigo al lenguaje HTML por no tener suficientes herramientas de formato para remarcar el “compraron”; resultó que todo iba como la seda. Asignamos un servidor normalito, con treinta y dos gigas de RAM y dos procesadores de ocho núcleos con tres discos SAS de trescientos gigas en RAID 5. Una cosa normalita para mover una base de datos e intercambio de ficheros de operaciones.\n"
                + "\n"
                + "La aplicación en cuestión se comunica con dispositivos remotos mediante un fichero que se deja en un directorio y los dispositivos remotos preguntan si hay algo mediante FTP, o si tienen que dejar algo para que la aplicación procese, pues lo dejan mediante el mismo sofisticado mecanismo. Hasta ahí todo muy siglo XX, pero bien. Entonces, la parte servidora hace lo que coño sea que tenga que hacer y devuelve el resultado a impresoras, dispositivos, gente, máquinas de café, etc.\n"
                + "\n"
                + "Todo esto que cuento no puede parecerle a nadie ni medio complicado. No lo es. De hecho, las operaciones se parecen mucho a un carrito de la compra. Sin embargo, de un tiempo a esta parte, la aplicación se ha ralentizado hasta límites inaceptables.\n"
                + "\n"
                + "La base de datos no es. Aquí mi colega el MKII ha sacado los diplomas Emecé, los ha puesto encima de la mesa y ha tuneado la base de datos puesto que el servidor de bases de datos fue forjado en Mordor. De hecho, la base de datos responde ahora como un puto tiro. Me voy a tener que hacer un Emecé para aprender cosas tan chula. No quisiera quitarle méritos a MKII por nada del mundo. Es un tío formado y serio. Pero que digo yo que se tiene que notar el aumento de rendimiento si pones índices coherentes a las tablas de la base de datos. Aunque sea uno. Porque no tenía ni un mal índice. Nada.\n"
                + "\n"
                + "Descartada la base de datos miramos el procesador. Los procesadores. Nada. La aplicación provocaba algunos picos pero nada que perturbase la paz de los dieciséis núcleos instalados. Tan panchos estaban limándose las uñas.\n"
                + "\n"
                + "La memoria no era tampoco. Había memoria libre para aburrir. El disco tampoco estaba muy ocupado, la verdad. La red local estaba tocando las palmas y los enlaces al exterior relajados y con capacidad testada. No era tampoco.\n"
                + "\n"
                + "Aquello tenía pinta de que iba a ser el pin siete del RJ45 o que habíamos encendido el servidor con el dedo en ángulo de doce grados en lugar de dieciséis. Vamos, que sólo nos quedaba un sospechoso: el programa.\n"
                + "\n"
                + "Y ahí estuvo mi error. $Hyperboss fue informado pertinentemente por Gargamel de un problema informático sin resolver y nos reunió a MKII y a mi en su despacho. Muy serio.\n"
                + "\n"
                + "-Pero vamos a ver, Wardog: si el servidor es muy lento, cámbialo.\n"
                + "-Que no. que no es lento, oiga. El servidor no es.\n"
                + "-¡Ponle más memoria!\n"
                + "-No le hace falta, no la está gastando.\n"
                + "-¿Entonces?\n"
                + "-Como no sea el programa…\n"
                + "-¿Y por qué iba a ser el programa?\n"
                + "-Por exclusión. Me quedan el programa y los usuarios. Y por una vez les voy a dar un voto de confianza a los usuarios porque no pueden tocar nada de la aplicación, sólo la echan de comer.\n"
                + "-Pues llama a los del programa.\n"
                + "-Ya lo he hecho.\n"
                + "-¿Y qué te dicen?\n"
                + "-Que es por la red de la empresa, que a ellos les va bien.\n"
                + "-¡Pues cambia la red!\n"
                + "-No. Va bien. La red no es.\n"
                + "-¿Lo sabrán mejor los del programa, no?\n"
                + "-No. Ellos ni puta idea de cómo va nuestra red. Ellos saben de su programa.\n"
                + "-Vale, pues si no es la red, ¿qué es?\n"
                + "-Insisto: el programa o el usuario. Descarto el usuario.\n"
                + "-Pues busca otra causa.\n"
                + "-Un pitufo epiléptico ha estado practicando sexo tántrico con doce sapos encantados sobre los portales RFID me parece una causa razonable.\n"
                + "-¡Una causa seria!\n"
                + "-Con todos los respetos- interrumpe EL Máquina II,- pero Wardog tiene razón. No puede ser otra cosa que el programa. Hemos descartado las demás opciones y no tenemos ningún interés en llevar razón, sino que simplemente, el resto de posibles causas están funcionando perfectamente.\n"
                + "-Vamos a ver si nos entendemos, muchachos-, se frota el puente de la nariz concienzudamente.- He pagado una cifra considerable a una empresa de desarrollo de software muy conocida para que esa aplicación vuele. No me puedo creer que, después de seis meses, ya no funcione. Algo habéis tocado.\n"
                + "-No. Conforme la dejaron los artistas de $Bullshitsoft está. De hecho, ni siquiera hemos habilitado ningún puesto nuevo ni hemos quitado los existentes. Cero cambios.\n"
                + "-¡Pues algo tiene que ser!- dice con un puñetazo en la mesa.\n"
                + "-¡Pues es el programa!- replico con una palmada y un firulillo flamenco por encima de la cabeza.\n"
                + "\n"
                + "Nos miramos fijamente a los ojos. Él con el puño aún en la mesa. Yo, con la mano a diez centímetros de la cabeza  y la palma hacia arriba.\n"
                + "\n"
                + "-El programa no puede ser, Wardog. Que me ha costado una millonada.\n"
                + "-Primera fase del duelo: negación. El Titanic también costó una millonada. Y ahí está, en calo.\n"
                + "-Pues mira a ver qué falla en el programa y arréglalo.\n"
                + "-No puedo.\n"
                + "-¿Cómo que no puedes?\n"
                + "-No puedo. Sabemos que en los dispositivos el cambio de una pantalla a otra tarda mucho, pero no sabemos qué coño hace en el intervalo. A veces la conexión explota y otras veces suelta un error inespecífico. Pero sin el código fuente no podemos saber qué es lo que le pica.\n"
                + "-¡Pues que lo arreglen los de $Bullshitsoft!\n"
                + "-No. Como son tan guays y tan caros, si no les damos un diagnóstico claro, no mueven un dedo.\n"
                + "-¿Cómo que no?\n"
                + "-Como que no. Que o les decimos qué va mal o no pueden hacer nada. Y nuestra mejor aproximación a un diagnóstico detallado es: “Todo va lento”.\n"
                + "-¡Ponme con ellos!\n"
                + "\n"
                + "Marco el número en el teléfono de sobremesa de $Hyperboss. Pide hablar con soporte. Grita mucho. Dice que va lento. Se calma. Dice que eso espera. Cuelga.\n"
                + "\n"
                + "-Ya está, solucionado.\n"
                + "-¿Ya va rápido el programa?\n"
                + "-No, joder. Mañana tenemos aquí a un ingeniero de la empresa para arreglarlo. Sólo hacía falta ponerse duro.\n"
                + "-Entonces no está solucionado.\n"
                + "-¡Pero mañana estará solucionado!\n"
                + "-Vale, vale, si yo lo decía por hablar con propiedad.\n"
                + "\n"
                + "Al día siguiente, a las nueve de la mañana se presentó un ingeniero de $Bullshitsoft en $Suprakillminds, con su chaqueta, su corbata y las manos en los bolsillos. $Deity me libre de prejuzgar a la gente, pero mi olfato canino para detectar imbéciles me estaba alertando acerca de este individuo.\n"
                + "\n"
                + "Le cogí de la manita y me lo llevé, a petición suya, a ver cómo iban de lento los terminales equipados con su software. Se colocó detrás de un operario para ver cómo trabajaba el hombre.\n"
                + "\n"
                + "-Ahá-. Dijo muy concentrado el ingeniero.- Parece que tenemos un problema de velocidad.\n"
                + "-¡No me digas! ¿Cómo lo has notado? ¿Quizá por el hecho de que nuestro operario puede pulsar un botón cada minuto y medio?\n"
                + "-Sí. Parece que hay algo que ralentiza la aplicación.\n"
                + "-Y así, concretando más…\n"
                + "-No sé. Pero efectivamente, va todo muy lento.\n"
                + "-Eso ya lo sabíamos y os lo hicimos saber.\n"
                + "-Pero ahora ya lo sabemos con certeza.\n"
                + "-Anda. Oye, me tienes que decir dónde estudia uno la carrera de saber las cosas con certeza. Porque ya hemos comunicado en varias ocasiones que todo el aplicativo se arrastra como una babosa coja.\n"
                + "-Bien, yo hablaré con los programadores para que lo revisen.\n"
                + "-¿Para que revisen qué?\n"
                + "-El problema de lentitud.\n"
                + "-¿Y cuál es la causa concreta por la que va lento?\n"
                + "-No lo sé, es algo general.\n"
                + "-Tócate los cojones. Yo, de verdad, con vosotros es que aprendo. ¡Ay si yo me hubiese hecho ingeniero en vez de puta!\n"
                + "\n"
                + "El ingeniero ingenioso se fue con las manos en los bolsillos as fast as he came. Dejando en mi correo electrónico un precioso informe de dos líneas redactado al vuelo con su Ladrilloberry. Eso es un usuario móvil avanzado, amigos.\n"
                + "\n"
                + "Le enseñé el informe a $Hyperboss. Lo leyó doce veces, incrédulo. El informe rezaba:\n"
                + "\n"
                + "    Detectada ralentización en todos los procesos de la aplicación.\n"
                + "\n"
                + "    Se pasa tarea a soporte para corrección y puesta en producción.\n"
                + "\n"
                + "Y debajo la firma del Ingeniero en Diagnósticos por la prestigiosa Universidad Handinpockets.\n"
                + "\n"
                + "Casi podía apreciar cómo la ira se abría camino desde la vésicula biliar de $Hyperboss hacia su garganta y cómo el hombre, en un esfuerzo de autocontrol la retenía ahí.\n"
                + "\n"
                + "-Wardog… ¿cómo se llama eso que decís los informáticos para tocar los programas?\n"
                + "-¿Dedo? – juego con él.\n"
                + "-No, coño. Lo de programar.\n"
                + "-Ah. Código fuente.\n"
                + "-Si os consigo el código fuente, ¿podéis mirar qué coño le pasa a la aplicación?\n"
                + "-Podemos intentarlo. Pero no le van a dar el código fuente.\n"
                + "-Ya te digo yo que sí me lo dan.\n"
                + "\n"
                + "Dicho y hecho. Al día siguiente $Hyperboss se presentó en el departamento mientras desayunábamos y me puso en la mesa un pendrive con el código fuente de la aplicación de los cojones. MKII y yo lo miramos atemorizados. Parece vibrar quedamente, emitir una especie de fulgor fantasmagórico. Era algo difícil de explicar. Como una luz oscura. Como si estuviese iluminado por la oscuridad que emitía.\n"
                + "\n"
                + "Al final lo cogí con más curiosidad que ganas y lo puse en mi equipo. Abrí el pendrive y vi que contenía un directorio de nombre “SRC”. Vamos bien, hasta ahí lo entiendo. Abro el directorio y veo el nombre Suprakillminds. Abro y tenemos “srv” y “clt”. Joder, qué bueno soy. Hasta aquí entiendo todo.\n"
                + "\n"
                + "Abro primero “srv” y veo un proyecto de Mordor Cé Cross Plus. Abro el proyecto y ante mí se muestra en toda su grandeza. Siempre me maravillo cuando veo un programa hecho con un lenguaje orientado a objetos que no implementa ni una clase. De hecho, el programa principal parece ser un monolítico fichero. Todo corre en un gigantesco loop cuya única condición de salida es, al parecer, un valor uno en una variable de nombre “salir”.\n"
                + "\n"
                + "Empiezo a leer mientras MKII gestiona cosas, pero tanto me oye bufar que se trae la silla a mi puesto y se pone a leer en la pantalla.\n"
                + "\n"
                + "-Mira, tenemos seis scrolls completos sólo para las variables globales. No está mal, ¿eh?\n"
                + "-¿Y por qué hay tantas variables globales?\n"
                + "-Y  yo qué sé. Espera, espera, terrible sospecha. Mira, ahí está.\n"
                + "-¿El qué?\n"
                + "-¿No lo ves? ¡Todas las funciones devuelven void!\n"
                + "-¡No jodas!\n"
                + "-¡Claro! ¡Son unos cracks! ¡Si todas las variables son globales no hace falta pasar parámetros ni devolver valores!\n"
                + "-Pero eso no es eficiente.\n"
                + "-¡Porque tú lo digas! ¡Es súper efectivo! ¡Efectivo que te defecas haciendo estrellitas!\n"
                + "-¿Hablas en serio?\n"
                + "-No. Ah, mira, ¿ves? Aquí hay funciones que no devuelven void. Desde luego, qué malpensado somos.\n"
                + "-Oye, pero esa función…\n"
                + "-Sí, ¿qué pasa? Suma dos variables globales y devuelve el resultado. Y te callas que te veo un poco talibán del Mordor Cé Cross Plus.\n"
                + "-¿Hablas en serio?\n"
                + "-Que no, coño, pero es que si no relajo tensiones con las coñas me van a empezar a sangrar los ojos.\n"
                + "-Espera, espera, ¿qué es eso?- me dice MKII abriendo mucho los ojos y señalando la pantalla. Me da palmaditas con su mano helada en el antebrazo.\n"
                + "-Oh. $deity desdoblado.\n"
                + "\n"
                + "Me envaro en la silla y empiezo a hiperventilar. Antes nuestros estupefactos ojos se muestran brillantes, sólidos, rotundos y pulidos, incontables GOTOs destacando sobre el blanco del editor como una macha de sangre fresca en la nieve. Pero no es sólo el GOTO infame. Es que, uno tras otro, y sin orden lógico aparente, los GOTOs envían la ejecución del programa a etiquetas de nombre tan específico como “Label1”, “Label2”, “Label7” y así hasta “Labeln” siendo n un número entero desaforado.\n"
                + "\n"
                + "Con los ojos a punto de salírsenos de las órbitas nos levantamos sin decir nada en busca de bálsamo caliente. Por el pasillo nos encontramos a $Hyperboss. Le miramos con nuestra cara de espanto.\n"
                + "\n"
                + "-¡Qué tal chicos! ¿Entendéis el código fuente ese?\n"
                + "\n"
                + "Salimos corriendo gritando mucho con los brazos levantadaos. Bueno, esa fue mi primera intención; y sé que MKII me hubiese imitado, pero no. Permanecimos con nuestra cara de espanto estoicamente.\n"
                + "\n"
                + "-¿Chicos? ¿Lo podéis arreglar?\n"
                + "-Mire, $Hyperboss… eso no se puede arreglar. Por mucho que queramos. Es una perversión. Es… es…\n"
                + "-¿Ya estamos con las quejas? Primero que si no tenéis el código fuente, luego que si lo  tenéis.\n"
                + "-$Hyperboss- dice MKII.- Ese programa es obsceno.\n"
                + "-Está tan mal hecho que parece fabricado con trozos aleatorios de manual.\n"
                + "\n"
                + "MKII y yo nos miramos inmediatamente. Claro, por eso las etiquetas de los gotos se llaman Labelx. Trozos de manual.\n"
                + "\n"
                + "-Becarios- decimos al unísono.\n"
                + "-¿De qué habláis?\n"
                + "-Este programa lo han debido hacer becarios en precario.\n"
                + "-¿Con lo que cuesta lo van a haber hecho becarios? ¡Que es una empresa seria!\n"
                + "-Con lo que cuesta. El programa compila y funciona cumpliendo los requisitos. Facturado. Los becarios son gratis o baratos. Más margen de beneficio.- replico.\n"
                + "-Bueno, da igual. Me ha costado mucho conseguir el código fuente. Arregladlo como sea.\n"
                + "-Haremos lo que esté en nuestra mano.- contesta demasiado dispuesto MKII.\n"
                + "\n"
                + "Con un café en el cuerpo la cosa parece más soportable. El ejecutable principal de la parte cliente no parece tener más problemas que la sobredosis de tumores de código. El hijo de puta es feo y deforme, pero como sólo tiene que recoger unos ficheros, leerlos y meterlos en la base de datos y vive en una máquina absolutamente sobredimensionada, corre que se las pela.\n"
                + "\n"
                + "-Pero hay una cosa que no veo.- Dice MKII.\n"
                + "-¿El qué?\n"
                + "-¿Cómo pasa parámetros desde el bucle principal al programa de impresión?\n"
                + "-No sé, veamos el programa de impresión.\n"
                + "\n"
                + "Abro “print.cpp” y busco la entrada de parámetros. No la veo. Edición, buscar argc. Nop. ¿Cómo es posible? MKII y yo nos miramos extrañados. ¿Cómo es posible que un programa necesite un parámetro para imprimir un resultado y no lo reciba al iniciar la ejecución? ¿Cómo puede ser tan sofisticado? Una lectura rápida de main lo explica de inmediato.\n"
                + "\n"
                + "-Esto es lo más grande, MKII.\n"
                + "-¿Es eso lo que parece que es?\n"
                + "-Los parámetros los coge de una variable de entorno del sistema. ¿Qué te parece?\n"
                + "-Pero… ¿no se supone que si eso es así, se podría sobreescribir la variable de entorno y que las impresiones salgan por donde les de la gana?\n"
                + "-Veámoslo en el programa principal.\n"
                + "\n"
                + "Buscamos la llamada a print. Resulta que no, que no se puede sobreescribir dicha variable de entorno porque resulta que la llamada a print está detrás de un bucle del que sólo se sale si otra variable de entorno está a cero: la variable “PUEDIMP”. Así, tal cual la escribo. Cuando PUEDIMP tiene el valor apropiado (no parece ser booleana, sino otra cosa, tal vez trileana con valores sí, no y psá) se imprime y se cambia de nuevo el valor para indicar que está dispuesta a imprimir otra vez. Un semáforo un poco rústico y sobre todo, muy seguro.\n"
                + "\n"
                + "-La madre que los parió. ¿Y tú sabes lo que ha costado esto, Maqui?\n"
                + "-Lo sé. Y por eso sufro más que tú.\n"
                + "-Al comercial de esta casa hay que juzgarlo en Estrasburgo.\n"
                + "-En fin. Sigamos. Esto está feo, pero no afecta a la velocidad. Vamos a ver el cliente qué hace.\n"
                + "\n"
                + "Abro el directorio del cliente. Ahogo un grito. Intento tragar saliva y me cuesta horrores. MKII me mira. Mira la pantalla. Suspira hondamente. Me levanto. Voy hacia un armario y con un suspiro lo abro. Aparto las tarjetas serialix, los conmutadores manuales de puerto paralelo, un disco duro de cuarenta megas y una bolsa de conectores BNC. Maldigo no haberme puesto guantes de amianto. Cojo la caja que hay al fondo, blanca y en cuyo frontal reza “Visual Basic 6.0”.\n"
                + "\n"
                + "Saco el disco y lo meto en la unidad. Lo instalo en una máquina virtual con XP y abro por fin el proyecto. Reconozco de inmediato los formularios de la aplicación y paso a ver lo que hay detrás. MKII no tiene experiencia con esta atrocidad y no lo lee con la misma fluidez que yo.\n"
                + "\n"
                + "-Los controles no tienen nombre. Bueno, tienen el nombre por defecto-le explico.- Bien. Cojonudo. El código no está indentado. Mejor todavía.\n"
                + "-Para que luego digan que las llaves de C son un coñazo.\n"
                + "-Son una bendición divina. No me jodas.\n"
                + "\n"
                + "No pasa mucho rato hasta que veo el problema de lentitud de todos los clientes. El problema residen en la comunicación con la base de datos.\n"
                + "\n"
                + "-Mira, MKII, ya he encontrado el porqué de la lentitud.\n"
                + "-¿Sí? ¿Dónde?\n"
                + "-Mira, ¿ves esta matriz bidimensional?\n"
                + "-La veo.\n"
                + "-Pues ahí se monta la consulta SQL.\n"
                + "-¿Y por qué en una matriz?\n"
                + "-Por joder, porque no es para plantillar.\n"
                + "-Vale, ¿entonces a un lado el campo y al otro el valor y luego se concatena la sentencia?\n"
                + "-Que no, que no. A un lado se pone “select *” y al otro “from tabla” y ya.\n"
                + "-¿Cómo que “y ya”?\n"
                + "-Y ya. No hay where. No se selecciona de más de una tabla.\n"
                + "-¿Entonces cómo se filtran los resultados de la consulta?\n"
                + "\n"
                + "Sonrío como un maníaco.\n"
                + "\n"
                + "-Muy fácil: iteramos todos los valores de la consulta y nos quedamos con el que nos coincida. ¡Es genial!\n"
                + "-¿Cómo? ¿Cómo?\n"
                + "-¡Es genial! Y si necesito una subconsulta… ¡repito el proceso!\n"
                + "\n"
                + "Una risa nerviosa se apoderó de nosotros y nos tuvo fuera de combate durante una hora.\n"
                + "\n"
                + "¡Bimbambidubi! ¡Dubi!\n"
                + "\n"
                + "-¡Jiajiajiajiajia! ¡Sistemas, Joker al habla! ¡Jajajajaja!\n"
                + "-Cada día estáis peor ahí. Oye, que no tenemos internet y necesito entrar en los bancos.\n"
                + "-¡Jajajajaja! ¡Jiaaaajajajaja! ¡Bancos! ¡Bancos! ¡No sé ni quién eres tú! ¡Jiajajajia! ¡Pero da igual! ¡Iré puesto por puesto comprobando si tienes internet!\n"
                + "-¿De qué hablas?\n"
                + "-¡Es súper rápido! ¡Jiajiajiaaaaaa!\n"
                + "-¿Me lo arreglas o no?\n"
                + "-¡No! ¡Jiaaaaajajajajaaaaa!\n"
                + "\n"
                + "Cuando por fin conseguimos rehacernos, desconectamos los teléfonos y pasamos varios días modificando chapuzas similares en ambas partes del programa. Después de mucho tocar, de mucho corregir error de compilación tras error de compilación, conseguimos meter unos cuantos tumores que suplieran otros cuantos tumores más dañinos y la aplicación volvió a correr decentemente.\n"
                + "\n"
                + "Como Gargamel no informaba de nuestros progresos a $Hyperboss, decidí mandarle un correo electrónico.\n"
                + "\n"
                + "    Asunto: La aplicación ya va bien.\n"
                + "\n"
                + "    Cuerpo del texto: Pues eso.\n"
                + "\n"
                + "A los pocos minutos me llama al despacho.\n"
                + "\n"
                + "-He llamado a unos cuantos usuarios para comprobar que va bien y me han dicho que ya va como al principio. ¿Qué coño le pasaba al programa?\n"
                + "-Técnicamente a este problema se le conoce como “Rendimiento diferencial demo-producción” o “Mal del becario”.\n"
                + "-¿Y eso qué es?\n"
                + "-Pues que si un programa hace lo que tiene que hacer no necesariamente está bien hecho.\n"
                + "-Explícate.\n"
                + "-El programa fue bien cuando tenía pocos datos que manejar. Conforme la base de datos creció, resultó no estar bien preparado para manejar tantos datos.\n"
                + "-¿Y cómo lo habéis solucionado?\n"
                + "-Limitando los registros devueltos por la base de datos. ¿Pero por qué le interesan los detalles técnicos? Normalmente ésto le importa una mierda.\n"
                + "-Para decírselo al ingeniero de Bullshitsoft.\n"
                + "-Ah, yo les mando un informe.\n"
                + "-¿No te importa?\n"
                + "-En absoluto.\n"
                + "-Vale, gracias, Wardog.\n"
                + "-De nada. Oiga, una curiosidad. ¿Cómo consiguió el código fuente tan rápido?\n"
                + "-¿Conoces a Astaroth?\n"
                + "-¿El abogado?\n"
                + "-Él se lo trajo en un pendrive en dos horas.\n"
                + "-Joder.\n"
                + "\n"
                + "Yo seré BOFH, pero éste no veas lo cabrón que llega a ser en el mundo real. Astaroth es a los abogados lo que un volcán a un mechero de gas. Es capaz de acojonar a Satanás.\n"
                + "\n"
                + "Volví a mi despacho y redacté un email\n"
                + "\n"
                + "    Para: jefazos@bullshitsoft.es\n"
                + "    CC: higiniero@bullshitsoft.es\n"
                + "\n"
                + "    Asunto: Aplicación arreglada. Informe de reparación.\n"
                + "    Cuerpo: Ya funciona rápido. El problema era que tenéis a los becarios bajos de azúcar. Mantas.\n"
                + "\n"
                + "Enviar.";

        String subcadena = "$Hyperboss";
        String subcadena2 = "JEFAZO";
        String rojo = "\u001B[31m";
        String reset = "\u001B[0m";
        String texto2;

        int opcion;
        int inicio = 0;
        int contador = 0;

        do {
            System.out.println("1. Busque cuantas vesces aparece la palabra $Hyperboss.");
            System.out.println("2. Muestra el texto sustituyendo $Hyperboss por JEFAZO y además la colorea en rojo.");
            System.out.println("3. Mostrar por pantalla la última frase en la que aparece $Hyperboss.");
            System.out.println("4. Salir.");
            System.out.print("Introduzca una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    do {
                        inicio = texto.indexOf(subcadena, inicio);

                        if (inicio != -1) {
                            inicio += subcadena.length();
                            contador++;
                        }
                    } while (inicio != -1);

                    System.out.println("Veces que aparece " + subcadena + ": " + contador);
                    break;

                case 2:
                    
                    texto2 = texto.replace(subcadena, rojo + subcadena2 + reset);
                    System.out.println(texto2);
                    break;

                case 3:
                    String[] lineas = texto.split("\n");
                    boolean encontrado = false;

                    for (int i = lineas.length - 1; i >= 0; i--) {
                        if (lineas[i].contains(subcadena) && !encontrado) {
                            System.out.println(lineas[i]);
                            encontrado = true;
                        }
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opción incorrecta.");

            }
        } while (opcion != 4);
    }
}
        
