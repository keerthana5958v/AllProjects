package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("are u doctor or patient");
        System.out.println("enter 1 for doctor 2 for patient");
        String temp = sc.nextLine();
        if(temp.equals("1")){
            System.out.println("enter 1 to sign up as doctor, 2 to login as doctor");
            String tem2 = sc.nextLine();
            if(tem2.equals("1")){
                Doctor doc = new Doctor();
                doc.getDoctorName();
                System.out.println("enter password: ");
                doc.setPassword(sc.nextLine());
                boolean isAvailable = true;
                SignUp signup = new SignUp();
                Details doctor  = new Details(doc.getName() , doc.getPassword());
                Login login = new Login();
                login.setDoctorLogin(true);
                signup.newDoctor(doctor.getName() , doctor.getPassword() , isAvailable);
                System.out.println("enter 1 to edit availability , 2 for get All patients");
                String tem3 = sc.nextLine();
                if(tem3.equals("1")&&login.getDoctorLogin()){
                    System.out.println("are u available, press 1 for available and 2 for not available");
                    String tem4 = sc.next();
                    if(tem4.equals("1")){
                        isAvailable = true;
                        doc.updateAvailability(doc.getName() , isAvailable);
                    }
                    if(tem4.equals("2")){
                        isAvailable = false;
                        doc.updateAvailability(doc.getName() , isAvailable);
                    }
                }
                if(tem3.equals("2")&&login.getDoctorLogin()){
                    Patient patient = new Patient();
                    patient.getAllPatients();
                }
            }
            if(tem2.equals("2")){
                Doctor doc = new Doctor();
                System.out.println("enter doctor name:");
                String docName = sc.nextLine();
                System.out.println("enter password: ");
                String password = sc.nextLine();
                Login loginObj = new Login();
                loginObj.loginDoctor(docName , password);
                System.out.println("enter 1 to edit availablity , 2 for get All patients");
                String tem3 = sc.nextLine();
                boolean isAvailable = true;
                Login login = new Login();
                if(tem3.equals("1")&&login.getDoctorLogin()){
                    System.out.println("are u available, press 1 for available and 2 for not available");
                    String tem4 = sc.next();
                    if(tem4.equals("1")){
                        isAvailable = true;
                        doc.updateAvailability(doc.getName() , isAvailable);
                    }
                    if(tem4.equals("2")){
                        isAvailable = false;
                        doc.updateAvailability(doc.getName() , isAvailable);
                    }
                }
                if(tem3.equals("2")&&login.getDoctorLogin()){
                    Patient patient = new Patient();
                    patient.getAllPatients();
                }
            }

        }
        if(temp.equals("2")){
            System.out.println("enter 1 to sign up as patient, 2 to login as patient");
            String tem2 = sc.nextLine();
            if(tem2.equals("1")){
                // sign up
                SignUp signUp = new SignUp();
                Patient patient = new Patient();
                Doctor doc = new Doctor();
                patient.getPatientName();
                System.out.println("enter password: ");
                patient.setPassword(sc.nextLine());
                System.out.println("enter your health concern: ");
                String concern = sc.nextLine();
                int appointmentTime = patient.DEFAULT_APPOINTMENT_TIME;
                System.out.println("enter appointment time(0-24) hours");
                appointmentTime = sc.nextInt();
                if(!(appointmentTime<25 && appointmentTime >= 0)){
                    appointmentTime = patient.DEFAULT_APPOINTMENT_TIME;
                }
                signUp.newPatient(patient.getName() , patient.getPassword() , concern , appointmentTime);
                System.out.println("enter 1 to get all available doctors");
                if(sc.next().equals("1")){
                    doc.getAllAvailableDoctors();
                }
            }
            if(tem2.equals("2")){
                //login
                Login login = new Login();
                Doctor doc = new Doctor();
                System.out.println("enter your name: ");
                String name = sc.nextLine();
                System.out.println("enter password: ");
                String pass = sc.nextLine();
                login.loginPatient(name , pass);

                System.out.println("enter 1 to get all available doctors");
                if(sc.next().equals("1")){
                    doc.getAllAvailableDoctors();
                }
            }

        }


    }
}