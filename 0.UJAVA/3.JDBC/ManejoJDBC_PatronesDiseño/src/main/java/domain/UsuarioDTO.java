package domain;

/**
 *
 * @author ferajset
 */
public class UsuarioDTO {
    private int idUsuario;
    private String usuario;
    private String password;

    public UsuarioDTO() {
    }

    public UsuarioDTO(int idUsuario) { //para eliminar un usuario
        this.idUsuario = idUsuario;
    }

    public UsuarioDTO(String usuario, String password) { //para insertar un usuario
        this.usuario = usuario;
        this.password = password;
    }

    public UsuarioDTO(int idUsuario, String usuario, String password) { //para modificar un usuario
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", password=" + password + '}';
    }
    
}
