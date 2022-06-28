
package market2.Classes;

public class admin_form_dimensiones {
private int x_form_admin=800;
private int y_form_admin=400;

//Medidas de la barra susperior
private int x_barra_superiro = x_form_admin;
private int y_barra_superiro = 25;

//Medidas del boton cerrar
private int bto_cerrar = 25;

//Medidas de la barra de tareas
private int x_barra_tareas = 150;
private int y_barra_tareas = y_form_admin - y_barra_superiro;

//Medidas del panel contenedor
private int x_panel_contenedor = x_form_admin - x_barra_tareas;
private int y_panel_contenedor = y_form_admin - y_barra_superiro;

//Medidas del panel busqueda usuarios
private int x_panel_form_admin_busquedausu = x_barra_tareas;
private int y_panel_form_admin_busquedausu = 40;
private int x_paneles_barraTareas = x_barra_tareas;
private int y_paneles_barraTareas = 40;


//Medidas del panel horarios usuarios
private int x_panel_form_admin_horariosusu = x_barra_tareas;
private int y_panel_form_admin_horariosusu = 40;

//Medidas del contenedor horarios
private int x_contenedor_horarios = x_panel_contenedor;
private int y_contenedor_horarios = y_panel_contenedor;

//Medidas del contenedor busqueda
private int x_contenedor_busqueda = x_panel_contenedor;
private int y_contenedor_busqueda = y_panel_contenedor;

    public int getX_form_admin() {
        return x_form_admin;
    }

    public int getY_form_admin() {
        return y_form_admin;
    }

    public int getX_barra_superiro() {
        return x_barra_superiro;
    }

    public int getY_barra_superiro() {
        return y_barra_superiro;
    }

    public int getBto_cerrar() {
        return bto_cerrar;
    }

    public int getX_barra_tareas() {
        return x_barra_tareas;
    }

    public int getY_barra_tareas() {
        return y_barra_tareas;
    }

    public int getX_panel_contenedor() {
        return x_panel_contenedor;
    }

    public int getY_panel_contenedor() {
        return y_panel_contenedor;
    }

    public int getX_panel_form_admin_busquedausu() {
        return x_panel_form_admin_busquedausu;
    }

    public int getY_panel_form_admin_busquedausu() {
        return y_panel_form_admin_busquedausu;
    }

    public int getX_paneles_barraTareas() {
        return x_paneles_barraTareas;
    }

    public int getY_paneles_barraTareas() {
        return y_paneles_barraTareas;
    }

    public int getX_panel_form_admin_horariosusu() {
        return x_panel_form_admin_horariosusu;
    }

    public int getY_panel_form_admin_horariosusu() {
        return y_panel_form_admin_horariosusu;
    }

    public int getX_contenedor_horarios() {
        return x_contenedor_horarios;
    }

    public int getY_contenedor_horarios() {
        return y_contenedor_horarios;
    }

    public int getX_contenedor_busqueda() {
        return x_contenedor_busqueda;
    }

    public int getY_contenedor_busqueda() {
        return y_contenedor_busqueda;
    }



}
