/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square grass;

    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        moon = new Circle();
        grass = new Square();
    }

    public void draw()
    {
        // --- CASA ---
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();

        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.makeVisible();

        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        // --- CÉSPED ---
        grass.changeColor("green");
        grass.moveHorizontal(-310);
        grass.moveVertical(140);
        grass.changeSize(600);
        grass.makeVisible();

        // --- SOL ---
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-80);  // empieza arriba
        sun.changeSize(60);
        sun.makeVisible();

        // --- LUNA ---
        moon.changeColor("grey");
        moon.moveHorizontal(100);
        moon.moveVertical(200); // empieza debajo de la escena
        moon.changeSize(60);

        // --- Animación: sol baja hasta desaparecer ---
        sun.slowMoveVertical(300);
        // --- Cuando el sol ha desaparecido, aparece la luna ---
        moon.makeVisible();

        // --- Animación: luna sube lentamente ---
        moon.slowMoveVertical(-230); }
    }
