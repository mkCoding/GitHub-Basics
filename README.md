
<b>GitHub Branching Commands</b>

<b>Create Branch:</b> ```git branch feature-1``` </br>
<b>View all branches:</b> ```git branch -a``` </br>
<b>Switch Branch:</b> ```git checkout feature-1``` </br>

<b>Delete Branch:</b> <br/>
1.) ```git checkout [base-branch]``` <br/>
2.) ```git branch -d feature-1``` <br/>

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


<b>Show commit history:</b> ```git log --oneline```
