

#### Cat these file and copy it then paste it 
#### to the terminal and it will give all the 
#### Aliaeses for Git

 
#1.1.1 # Color Log 
git config --global alias.l "log --pretty=format:\"%C(yellow)%h%Cred%d\\ %Creset%s%Cblue\\ [%cn]\" --decorate"


# 1.2 # write some aliases for git
alias s='clear && git status'
alias l='clear && git l '
alias c='git commit -m '
alias a='git add . && s'
alias b=' git branch '


#### Run Package 
##   Make sure you are in the pom directory
mvn clean package 
java -cp target/create_make_Files-1.0-SNAPSHOT.jar john.org.create_make_files.AAAMain 

