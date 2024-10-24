
<b>GitHub Branching Commands</b>

<b>Create Branch:</b> ```git branch <new-branch-name>``` </br>
<b>View all branches:</b> ```git branch -a``` </br>
<b>Switch Branch:</b> ```git checkout <new-branch-name>``` </br>
<b>Rename current branch:</b> ```git branch -m <new-branch-name>```

<b>Delete Branch:</b> <br/>
1.) ```git checkout [base-branch]``` <br/>
2.) ```git branch -d feature-1``` (local)<br/>
3.) ```git push origin --delete feature-1```(remote) </br>

<b>Merge branch to main:</b><br/>
1.) ```git checkout main``` <br/>
2.) ```git merge feature-a``` (merge) <br/>

<b>Commit to your branch:</b><br/>
1.) ```git add .``` <br/>
2.)```git commit -m "commit message"``` <br/>
3.) ```git push -u origin my-feature-branch``` <br/>

<b>Removes all references to branches that have been deleted from the remote repository.</b><br/>
1.) ```git remote prune origin``` <br/><br/>

<b>Cleans Working directory [Ensure that no untracked files are present in your working directory]</b><br/>
1.) ```git clean -fd``` 


<b>Show commit history:</b> ```git log --oneline``

<b><ins>Incorporate your feature branch changes into development</ins></b> <br/>
1.) ```git pull development```<br/>
2.) ```git branch feature-branch```<br/>
3.) Make some changes to your feature branch<br/>
4.) ```git add .```<br/>
5.) ```git commit -m "added some changes"```<br/>
6.) ```git push -u origin feature-branch```<br/>
7.) ```git checkout development```<br/>
8.) ```git pull (pull latest changes)```<br/>
9.) ```git checkout feature-branch```<br/>
10.) ```git rebase development```<br/>
11.) ```Resolve merge conflicts (if applicable)```<br/>
12.) Run app to ensure everything is fine<br/>
13.) ```git push -f``` (push integrated development changes to your remote feature branch)<br/>

<b>Merge or Rebase your features back into development</b><br/>
14.) ```git checkout development``` (merge the updated code back into development<br/>
15.) ```git merge/rebase feature-branch```<br/>
16.) ```git push```<br/>

14 - 16 can also be done via GitHub via Pull request to review changes before the merge


<b><ins>How to Abort the rebase and restore the branch to its original state.</ins></b> <br>
```git rebase --abort``` <br>

<b>Fetch the branch branch_name from the remote (origin) and creates a corresponding local branch with the same name.</b> <br>
```git fetch origin branch_name:branch_name```<br><br>

<b><ins>Troubleshooting Git</ins></b> <br/>

<b>Issue #1</b><br>
After performing <b>git pull</b>  you get this error:  
```cannot lock ref 'refs/remotes/origin/xxxxx/xxxx'....```

 <b>Solution:</b> ```git remote prune origin```

 <b>Issue #2</b><br/>
 After performing a ```git push -f``` or ```git push -u origin your-feature-branch``` you get this:<br>
 ```the upstream branch of your current branch does not match the name of your current branch```<br><br>
 <b>Solution:</b> <br>
 Your local and remote branch have different names<br><br>
 <b>2 possible solutions</b><br>
 1.) rename your <b>local branch</b> to same name as <b>remote branch</b><br/>
 2.) delete the <b>remote branch</b> and push again
 











