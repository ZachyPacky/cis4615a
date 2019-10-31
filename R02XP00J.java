public void delete() {
  File someFile = new File("someFileName.txt");
  //Do something with someFile
  if (!someFile.delete()) {
    //Handle failure to delete the file
  }
}
