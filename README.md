# DockerDemo

## Links
https://sii.pl/blog/docker-wprowadzenie/
https://frontstack.pl/docker-wprowadzenie/


## Commends

`docker images`

`docker ps`

`docker ps -a`

`docker run nginx` 

`docker run -d nginx`

`docker exec -it`

`docker stop`

`docker start`

`docker rmi`

`docker rm`

`docker rm $(docker ps -a -q)`

## Mapping ports
https://docs.docker.com/config/containers/container-networking/

## Volumes
https://docs.docker.com/storage/volumes/

`docker run -d --name devtest -v ./:/app nginx:latest`