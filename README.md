
# Github Basics<br><br>

## GitHub Branching Commands

<b>Create Branch:</b> ```git branch <new-branch-name>``` </br>
<b>View all branches:</b> ```git branch -a``` </br>
<b>Switch Branch:</b> ```git checkout <new-branch-name>``` </br>
<b>Create and Switch to a new branch:</b> ```git checkout -b new_branch```</br>
<b>Rename current branch:</b> ```git branch -m <new-branch-name>```

<b>Fetch a Remote Branch into an Existing Local Repo</b></br>
1.) ```git fetch origin <branch-name>``` (fetch the branch)</br>
2.)```git checkout -b <branch-name> origin/<branch-name>``` (create and checkout the branch locally)</br>
3.)```git branch``` (view the new local branch now on your machine)</br>

<b>Delete Branch:</b> <br/>
1.) ```git checkout [base-branch]``` <br/>
2.) ```git branch -d [branch-to-delete]``` (local)<br/>
3.) ```git push origin --delete [branch-to-delete]```(remote) </br>

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

## Rebasing and Merging
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
14.) ```git checkout development```<br/>
15.) ```git merge/rebase feature-branch``` (merge the updated code back into development) <br/>
16.) ```git push```<br/>

14 - 16 can also be done via GitHub via Pull request to review changes before the merge

<b><ins>How to Abort the rebase and restore the branch to its original state.</ins></b> <br>
```git rebase --abort``` <br>

## Pull
<b>Pull:</b> Fetch and download content from a remote repository and immediately update the local repository to match that content. <br>

<b>Commands: </b><br>
- ```git pull```<br>
- ```git pull origin <branch-name>```<br>
- ```git pull --rebase``` - if there are changes on branch that have been rebased then use this


## Stash

<b>Stash:</b> Temporarily save your changes without committing them to a branch<br>

<b>Commands: </b>
- ```git stash``` -> save changes without committing them to a branch <br>
- ```git stash push -m "Your comment here"``` -> stash changes with a message<br>
- ```git stash push -u -m "Your comment here"```-> stash tracked and untracked files with a message<br>
- ```git stash list``` -> list all stashes <br>
- ```git stash apply``` -> Reapply the most recent stash <br>
- ```git stash apply stash@{n}```-> Reapply a specific stash from list <br>
- ```git stash drop``` -> Remove latest stash<br>
- ```git stash drop stash@{n}``` -> Remove specific stash from list<br>
- ```git stash clear``` -> clear all stashes<br>
- ```git stash branch <branch-name>``` -> Create a new branch from a stash<br>
- ```git restore .``` -> This will reset your working directory to the last committed state.


<b><ins>You have uncommitted changes in a local branch and want to switch to another branch without passing over those changes</ins></b> <br>
Step 1: You are on `branch-A` with uncommitted changes<br>
```git stash```              # Save changes and clean the working directory<br>
```git checkout branch-B```  # Switch to another branch (e.g., branch-B)<br>

Step 2: Work on `branch-B` and then return to `branch-A` <br>
```git checkout branch-A```  # Switch back to the original branch<br>
```git stash apply```        # Restore the stashed changes on `branch-A`<br>


## Git Reset Hard

- ```git reset --hard``` -> resets your working directory, staging area, and current branch to a specific commit(latest commit by default)<br>
- ```git reset --hard [commit-hash]``` -> Resets to the specified commit in the commit history

<b>Fetch the branch branch_name from the remote (origin) and creates a corresponding local branch with the same name.</b> <br>
```git fetch origin branch_name:branch_name```<br><br>

<b><ins>Your remote branch has been rebased and you want changes from rebased remote branch on your local</ins></b> <br>
1.) `git fetch origin` - Updates your local information about the remote branches without changing your working branch <br> 
2.) `git reset --hard origin/your-branch-name` - `Forces your local branch to match the remote branch exactly, discarding any local changes or commits that differ from the remote branch`

## Cherry Pick
Define: to take a single commit from one branch and adding it as the latest commit on another branch

Commands:
- ```git cherry-pick <commit-hash>``` -> cherry pick a specific commit
- Process for cherry picking:
1. ```git checkout parent-branch``` -> checkout parent branch
2. ```git pull origin parent-branch``` -> Ensure you're up to date
3. ```git checkout -b new-branch``` -> Create and checkout the new branch
4. ```git checkout <other-branch>``` -> checkout branch you want to pick commits from
5. ```git log --oneline``` -> view all commits on the this branch (candidates/commits for cherry picking)
6. ```git cherry-pick <commit-hash>``` or ```git cherry-pick <commit-hash-1> <commit-hash-2> <commit-hash-3>```
7. ``git push origin <new-branch>```
  


## Troubleshooting Git</ins></b><br>

<b>Issue #1</b><br>
After performing <b>git pull</b>  you get this error:  
```cannot lock ref 'refs/remotes/origin/xxxxx/xxxx'....```

 <b>Solution:</b> ```git remote prune origin```

 <b>Issue #2</b><br/>
 After performing a ```git push -f``` or ```git push -u origin your-feature-branch``` you get this:<br>
 
 ```
 the upstream branch of your current branch does not match the name of your current branch
```
 
 <b>Explaination:</b> <br>
 Your local and remote branch have different names<br><br>
 
 <b>2 possible solutions</b><br>
 1.) rename your <b>local branch</b> to same name as <b>remote branch</b><br/>
 2.) delete the <b>remote branch</b> and push again


 <b>Issue #3</b><br/>

You wish to sync the updated remote branch with your local branch. After performing a git pull origin <branch-name> you get this:<br>
```You have divergent branches and need to specify how to reconcile them.```

 <b>Explaination:</b> <br>
 The branch you're trying to pull from has changes that your local branch doesn't have, and your local branch also has<br>
 commits that the remote branch doesn't have. <br><br>

  <b>Solution </b><br>
 1.) ```git fetch origin``` -> Get all the latest updates from the remote repository without merging them into your local branch<br>
 2.) ```git reset --hard origin/your-branch-name``` -> reset your local branch to exactly match the remote branch (origin/your-branch-name).

 



 











