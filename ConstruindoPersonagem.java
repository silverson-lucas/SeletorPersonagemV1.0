package com.mycompany.criadordepersonagem;
public class ConstruindoPersonagem  implements Caracteristicas{
    private boolean Criado;
    private boolean Men;
    private boolean Women;
    private boolean ColorSkin;
    private boolean WhiteSkin;
    private boolean YellowSkin;
    private boolean BlackSkin;
    private boolean WomanFaceTipe1;
    private boolean MenFaceTipe1;
    private boolean WomanFaceTipe2;
    private boolean MenFaceTipe2;
    private boolean WomanFaceTipe3;
    private boolean MenFaceTipe3;
    private boolean Archer;
    private boolean Soldier;
    private boolean Witcher;
    
            
    public ConstruindoPersonagem(){
        this.Criado = false;
        this.Men = false;
        this.Women = false;
        this.ColorSkin = false;
        
    }
    public boolean getCriado(){
        return this.Criado;
    }
    public boolean getMen(){
        return this.Men;
    }
    public boolean getWomen(){
        return this.Women;
    }
    public boolean getColorSkin(){
        return this.ColorSkin;
    }
    public boolean getWhiteSkin(){
        return this.WhiteSkin;
    }
    public boolean getYellowSkin(){
        return this.YellowSkin;
    }
    public boolean getBlackSkin(){
        return this.BlackSkin;
    }
    public void setCriado(boolean Criado){
        this.Criado = Criado;
    }
    public void setMen(boolean Men){
        this.Men = Men;
    }
    public void setWomen(boolean Women){
        this.Women = Women;
    }
    public void setColorSkin(boolean ColorSkin){
        this.ColorSkin = ColorSkin;
    }
    public void setWhiteSkin(boolean WhiteSkin){
        this.WhiteSkin = WhiteSkin;
    }
    public void setYellowSkin(boolean YellowSkin){
        this.YellowSkin = YellowSkin;
    }
    public void setBlackSkin(boolean BlackSkin){
        this.BlackSkin = BlackSkin;
    }

    public boolean getWomanFaceTipe1() {
        return WomanFaceTipe1;
    }

    public void setWomanFaceTipe1(boolean WomanFaceTipe1) {
        this.WomanFaceTipe1 = WomanFaceTipe1;
    }

    public boolean getMenFaceTipe1() {
        return MenFaceTipe1;
    }

    public void setMenFaceTipe1(boolean MenFaceTipe1) {
        this.MenFaceTipe1 = MenFaceTipe1;
    }

    public boolean getWomanFaceTipe2() {
        return WomanFaceTipe2;
    }

    public void setWomanFaceTipe2(boolean WomanFaceTipe2) {
        this.WomanFaceTipe2 = WomanFaceTipe2;
    }

    public boolean getMenFaceTipe2() {
        return MenFaceTipe2;
    }

    public void setMenFaceTipe2(boolean MenFaceTipe2) {
        this.MenFaceTipe2 = MenFaceTipe2;
    }

    public boolean getWomanFaceTipe3() {
        return WomanFaceTipe3;
    }

    public void setWomanFaceTipe3(boolean WomanFaceTipe3) {
        this.WomanFaceTipe3 = WomanFaceTipe3;
    }

    public boolean getMenFaceTipe3() {
        return MenFaceTipe3;
    }

    public void setMenFaceTipe3(boolean MenFaceTipe3) {
        this.MenFaceTipe3 = MenFaceTipe3;
    }

    public boolean getArcher() {
        return Archer;
    }

    public void setArcher(boolean Archer) {
        this.Archer = Archer;
    }

    public boolean getSoldier() {
        return Soldier;
    }

    public void setSoldier(boolean Soldier) {
        this.Soldier = Soldier;
    }

    public boolean getWitcher() {
        return Witcher;
    }

    public void setWitcher(boolean Witcher) {
        this.Witcher = Witcher;
    }
    
    public void whriting(){
        System.out.println("o personagem está criado ? " + this.Criado );
        System.out.println("o personagem é homen ? " + this.Men );
        System.out.println("o personagem é mulher ? " + this.Women);
        System.out.println("qual a cor do seu personagem ?" + this.ColorSkin);
        System.out.println("escolha as características do seu personagem");
    }
    
    @Override
    public void Women() {
        setWomen(true);
    }
    
    @Override
    public void Men() {
        setMen(true);
    }

    @Override
    public void SkinColor() {
        setColorSkin(true);
    }

    @Override
    public void WhiteSkin() {
         if (getMen() ^ (getWomen()) &&  getCriado()){
           setWhiteSkin(true);
         }
    }

    @Override
    public void YellowSkin() {
        if(getMen() ^(getWomen()) && getCriado() && !(getWhiteSkin())){
            setYellowSkin(true);
        }
    }

    @Override
    public void BlackSkin() {
        if(getMen() ^ (getWomen()) && getCriado() && !(getYellowSkin()) && !(getWhiteSkin())){
            setBlackSkin(true);
        }
    }

    @Override
    public void WomanFaceTipe1() {
        if(getWomen() && getCriado()){
            setWomanFaceTipe1(true);
        }
    }

    @Override
    public void MenFaceTipe1() {
        if(getMen() && getCriado()){
            setMenFaceTipe1(true);
        }
    }

    @Override
    public void WomanFaceTipe2() {
        if(getWomen()&& !(getWomanFaceTipe1())&& getCriado()  ){
           setWomanFaceTipe2(true);
        }
    }

    @Override
    public void MenFaceTipe2() {
        if(getMen() && !(getMenFaceTipe1()) && getCriado() ){
            setMenFaceTipe2(true);
        }
    }

    @Override
    public void WomanFaceTipe3() {
        if(getWomen() && ! (getWomanFaceTipe1()) && !(getWomanFaceTipe2()) && getCriado()){
            setWomanFaceTipe3(true);
        }
       
    }

    @Override
    public void MenFaceTipe3() {
        if(getMen() && !(getMenFaceTipe1()) && ! (getMenFaceTipe2()) && getCriado()){
            setMenFaceTipe3(true);
        }
    }

    @Override
    public void Archer() {
        if (getCriado()){
            setArcher(true);
        }
    }

    @Override
    public void Soldier() {
        if (getCriado() && !(getArcher())){
            setSoldier(true);
        }
    }

    @Override
    public void Witcher() {
        if (getCriado() && ! (getArcher()) && ! (getSoldier())){
            setWitcher(true);
        }
    }

}