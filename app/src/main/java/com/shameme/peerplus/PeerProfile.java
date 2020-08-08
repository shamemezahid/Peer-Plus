package com.shameme.peerplus;

import java.util.Date;

public class PeerProfile {
    private String peerName;
    private int peerRegNumber;
    private int peerRollNumber;
    private String hall;
    private String gender;
    private String phonePrimary;
    private String phoneSecondary;
    private String emailPrimary;
    private String emailSecondary;
    private String bio;
    private String bloodGroup;
    private boolean isBloodDonor;
    private Date birthDay;
    private String homeTown;
    private String currentResidenceArea;
    private String photoUrl;
    private String facebookUrl;
    private String instagramUrl;
    private String githubUrl;
    private String linkedInUrl;
    private String discordUrl;
    private String lastOnline;
    private boolean isShareLocation;

    public PeerProfile() {
    }

    public PeerProfile(String peerName,
                       int peerRegNumber,
                       int peerRollNumber,
                       String hall,
                       String gender,
                       String phonePrimary,
                       String emailPrimary,
                       String bloodGroup,
                       boolean isBloodDonor,
                       Date birthDay) {
        this.peerName = peerName;
        this.peerRegNumber = peerRegNumber;
        this.peerRollNumber = peerRollNumber;
        this.hall = hall;
        this.gender = gender;
        this.phonePrimary = phonePrimary;
        this.emailPrimary = emailPrimary;
        this.bloodGroup = bloodGroup;
        this.isBloodDonor = isBloodDonor;
        this.birthDay = birthDay;
    }

    public String getPeerName() {
        return peerName;
    }

    public void setPeerName(String peerName) {
        this.peerName = peerName;
    }

    public int getPeerRegNumber() {
        return peerRegNumber;
    }

    public void setPeerRegNumber(int peerRegNumber) {
        this.peerRegNumber = peerRegNumber;
    }

    public int getPeerRollNumber() {
        return peerRollNumber;
    }

    public void setPeerRollNumber(int peerRollNumber) {
        this.peerRollNumber = peerRollNumber;
    }

    public String getHall() {
        return hall;
    }

    public void setHall(String hall) {
        this.hall = hall;
    }

    public String getPhonePrimary() {
        return phonePrimary;
    }

    public void setPhonePrimary(String phonePrimary) {
        this.phonePrimary = phonePrimary;
    }

    public String getPhoneSecondary() {
        return phoneSecondary;
    }

    public void setPhoneSecondary(String phoneSecondary) {
        this.phoneSecondary = phoneSecondary;
    }

    public String getEmailPrimary() {
        return emailPrimary;
    }

    public void setEmailPrimary(String emailPrimary) {
        this.emailPrimary = emailPrimary;
    }

    public String getEmailSecondary() {
        return emailSecondary;
    }

    public void setEmailSecondary(String emailSecondary) {
        this.emailSecondary = emailSecondary;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public boolean isBloodDonor() {
        return isBloodDonor;
    }

    public void setBloodDonor(boolean bloodDonor) {
        isBloodDonor = bloodDonor;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getCurrentResidenceArea() {
        return currentResidenceArea;
    }

    public void setCurrentResidenceArea(String currentResidenceArea) {
        this.currentResidenceArea = currentResidenceArea;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public void setGithubUrl(String githubUrl) {
        this.githubUrl = githubUrl;
    }

    public String getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(String linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public String getDiscordUrl() {
        return discordUrl;
    }

    public void setDiscordUrl(String discordUrl) {
        this.discordUrl = discordUrl;
    }

    public String getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(String lastOnline) {
        this.lastOnline = lastOnline;
    }

    public boolean isShareLocation() {
        return isShareLocation;
    }

    public void setShareLocation(boolean shareLocation) {
        isShareLocation = shareLocation;
    }
}

