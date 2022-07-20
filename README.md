# DockerDemo

## Links
https://sii.pl/blog/docker-wprowadzenie/
https://frontstack.pl/docker-wprowadzenie/


## Commends

`docker images` - pobiera liste obrazów na lokalnym komputerze

`docker ps` - wyswietla uruchomione kontenery

`docker ps -a` - wyswietla uruchomione i zatrzymane kontenery

`docker pull` - pobranie obrazu na lokalny komputer
 
`docker run nginx` - uruchomienie nowego kontenera z obrazu nginx

`docker run -d nginx` - uruchomienie kontenera nginx w trybie deamon

`docker logs ngingx` - wysietla logi kontenera

`docker stop` - zatrzymanie kontenera

`docker start` - ponowne uruchomienie zatrzymanego wczesniej kontenera

`docker exec -it {container} bash` - uruchomienie polecenia w trybie terminala wewnarze kontenra

`docker run -d -p 8777:80 --name my-nginx nginx` - uruchominie w trybie deamon z przekirowaniem portu lokalnego 8777 na 80 wewntrz obrazu nginx ktory nazwalismy my-ngninx

`docker run -d -p 8777:80 --name my-nginx -v /home/grzegorz/workspace/DockerDemo/web/:/usr/share/nginx/html/ nginx` - to co powyzej plus podmapowanie loklanego katalogu ./web/ do usr/share/nginx/html wewnatrz kontenera
 !UWAGA - warto stosowac pelna sciezke do katalogu

`docker rmi` - usuwanie obrazu 

`docker rm` - usuwanie zatrzymanego kontenera

`docker rm $(docker ps -a -q)`

## Mapping ports
https://docs.docker.com/config/containers/container-networking/

## Volumes
https://docs.docker.com/storage/volumes/

`docker run -d --name devtest -v ./:/app nginx:latest`