WHAT IS GIT?
It is a version control system to locally track the changes in your project\folder and also push and pull changes from remote repositores like github,gitbucket	,gitlab

WHAT IS GIT LAB,GITBUCKET,GITHUB?

all are similer kind of services 
servies that allow to host your project/folder on a remote repository and have additional features as well to help in software development life cycle(sdlc),ci and cd

steps:1
goto gitlab.com and create an account

step:2
sign into gitlab

step:3
create a newproject on a gitlab

DOWNLOAD AND INSTALL GIT?
ADD A PROJECT/FOLDER TO GIT?
COMMIT AND PUSH PROJECT TO GITLAB?

step:1
download  and install git

step:2
check git is installed on your system git --version

step:3
run following commmands
git config --global user.name "banala-jwala
git config --global user.name

git config --global user.email "banalaprajwala@gmail.com
git config --global user.email

git config --global --list

step:4
create a demo project/folder and add to git
step:5
goto command or terminal or gitbash cd to the location of the folder and run following commands
		git init
		git status
		git add
		git commit -m"msg"
		git push -u "url"master
step:6
check project added on gitlab


WHAT IS FORK?
a fork is a copy of a project

HOW TO FORK A PROJECT?
forking a repo/pro allows you to make changes without affecting the original project

steps:
	1.login to gitlab and goto your project
	2.click on fork button
	after making changes to the fork project you can merge the changes to the original project using merge request

WHAT IS SSH KEY?
	ssh means secure shell
	used for authentication

HOW TO SETUP SSH KEY IN GITLAB?

	By setting sshkey you can connect to gitlab server without useing username and password eachtime

steps:
	1.run command ssh -keygen
	2.login to gitlab
	goto account>settings>sshkey
	3.copy contents of id -rsa.pub and add keygen
	4.verify sshkey is added
	
WHAT IS GIT LAB RUNNER?
used in git lab ci
  open.source continuouse integration service included with gitlab
  used to run jobs and send results back to gitlab
  
steps:
	1.install gitlab runner
	brew install gitlab-runner
	gitlab-runner --version
	
	2.register git lab runner
	3.start gitlab runner
	brew service start gitlab-runner
	brew service stop gitlab-runner
	4.check runner is activated in the project
	
	
git lab ci/cd

WHAT IS GITLAB CI/CD?
  gitlab ci is a open source ci service included with gitlab
   since version 8.0
	ci means continuous integration
	only project maintains and admin can access the settings
	
steps:
	1.add.gitlab-ci.yml in the root folder of your project/repo/pro
	gitlab ci/cd pipeline are configured using yaml fill called.gitlab-ci.yml in each project 
gitlab-ci.yml file defines the structure and order of the pipeline and determines

mac-textedit,textWrangler
windows -notepad,notepad++

		demo_job_1:
		tags:
		-ciscript:
		-echohloworld
2.commit and push file to gitlab repo/pro
3.create gitlab runner for the project
4.start the  runner
5.make any change in the project>commit>push