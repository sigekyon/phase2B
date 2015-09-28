package org.springframework.samples;

public class C_RepositoryImpl implements C_Repository{

    private long price;

    public void setPrice(long price){
        this.price =price;
    }

    @Override
    public long checkPrice(String lessonName) {
        return price;
    }

}
