    public static getKantaAsiakasData(String erotin){
        String data = super.getData(erotin);
        data += erotin + this.alennusprosentti;
        return data;
    }