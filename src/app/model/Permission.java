package app.model;

import javafx.scene.control.Alert;

public class Permission {

    private boolean blockedAccount;
    private boolean mayEdit;
    private boolean mayInsertData;
    private boolean mayExecuteQueries;
    private boolean hasAdminRights;

    /**
     * Default constructor
     * @param readOnly
     * @param changeContent
     * @param readQueries
     * @param changeProfileData
     * @param fullDatabaseAccess
     * @param fullProgramAccess
     */
    public Permission(boolean blockedAccount, boolean mayEdit, boolean mayInsertData, boolean mayExecuteQueries, boolean hasAdminRights){
        this.blockedAccount = blockedAccount;
        this.mayEdit = mayEdit;
        this.mayInsertData = mayInsertData;
        this.mayExecuteQueries = mayExecuteQueries;
        this.hasAdminRights = hasAdminRights;
    }

    /*
     * Getters
     */
    public boolean isBlockedAccount() {
        return blockedAccount;
    }
    public boolean isMayEdit() {
        return mayEdit;
    }
    public boolean isMayInsertData() {
        return mayInsertData;
    }
    public boolean isMayExecuteQueries() {
        return mayExecuteQueries;
    }
    public boolean isHasAdminRights() {
        return hasAdminRights;
    }


    /*
     * Setters
     */
    public void setBlockedAccount(boolean blockedAccount) {
        this.blockedAccount = blockedAccount;
    }
    public void setMayEdit(boolean mayEdit) {
        this.mayEdit = mayEdit;
    }
    public void setMayInsertData(boolean mayInsertData) {
        this.mayInsertData = mayInsertData;
    }
    public void setMayExecuteQueries(boolean mayExecuteQueries) {
        this.mayExecuteQueries = mayExecuteQueries;
    }
    public void setHasAdminRights(boolean hasAdminRights) {
        this.hasAdminRights = hasAdminRights;
    }

    public static Permission getDefaultPermission(){
        Permission p = new Permission(false, true, false, true, false);
        return p;
    }

    public static boolean arePermissionInstancesEqual(Permission p1, Permission p2){
        if(p1.blockedAccount != p2.blockedAccount) return false;
        if(p1.mayEdit != p2.mayEdit) return false;
        if(p1.mayInsertData != p2.mayInsertData) return false;
        if(p1.mayExecuteQueries != p2.mayExecuteQueries) return false;
        if(p1.hasAdminRights != p2.hasAdminRights) return false;

        return true;

    }




    /**
     * Shows an alert informing user of his account being blocked
     */
    public static void showBlockedAccountAlert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Brak uprawnie�");
        alert.setHeaderText("Twoje konto jest zablokowane");
        alert.setContentText("Twoje konto zosta�o zablokowane");
        alert.showAndWait();
    }

    /**
     * Informs user that he is not allowed to execute a command
     */
    public static void showDefaultAlert(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Brak uprawnień");
        alert.setHeaderText("Nie można wykonać polecenia");
        alert.setContentText("Twoje konto nie posiada wystarczających uprawnień, aby wykonać wskazane polecenie");
        alert.showAndWait();
    }


}
