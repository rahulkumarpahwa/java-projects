package CWH.Package;

// import CWH.Package.Cloud.*;

import CWH.Package.Cloud.AWS;
import CWH.Package.Cloud.DropBox;
import CWH.Package.Cloud.GoogleDrive;

public class UsingPackage {
    public static void main(String[] args) {
        // now here we will see the usage of the classes we create in the Package Cloud defined under path "package CWH.OOPS._6_Package.Cloud;" and we have three classes AWS, GoogleDrive and DropBox which includes no. of methods and we will try to use that.
        
        AWS a = new AWS();
        a.download();
        a.upload();
        a.view();

        GoogleDrive g = new GoogleDrive();
        g.upload();
        g.download();
        g.view();

        DropBox d = new DropBox();
        d.download();
        d.upload();
        d.view();
        
    }
}
