%----------------------------------------------------
%  		LABORATORIO 7
% 	  	 PARTE 1   
%
%Autor: Octavio Rivera Romero
%Fecha: 13-12-13
%Versión:1
%
%----------------------------------------------------
close all
clear all
clc

%----------------------------------------------------
%	Ficheros utilizados en este apartado
%	lab7.m  [mc]

%
%	[c] A completar por el alumno
%	[m] A modificar por el alumno
%
%----------------------------------------------------





%--------------------- Menú inicial
printf('Elige el apartado que quiere seleccionar\n');
printf('[1] Apartado 1: Binarizacion mediante umbral\n');
printf('[2] Apartado 2: Seleccion automatica umbral\n');
printf('[3] Apartado 3: Convolucion 2D\n');
printf('[4] Apartado 4: Perfilado\n');
printf('[5] Apartado 5: Realce y singularidades\n');
printf('[6] Apartado 6: Reduccion\n');


apartado = input('Elige la opción [1-6] ');
switch(apartado)


case 1 %Apartado 1

%----------------------------------------------------------------------
% En este apartado se binariza una imagen mediante el uso 
% de umbrales, que se pasan como parametro.
%----------------------------------------------------------------------
	
IN = imread('Objetos.jpg'); %modificar
[filas, cols, canales] = size(IN);
imshow(IN);
threshold = 100; %modificar


bwimage=myImage2BW(IN, threshold);

figure(2);
imshow(bwimage);

%[c] Representar el histograma del resultado
h = histogram(bwimage,1); 
figure(3); 
showHisto(h); 


case 2 %Apartado 2

%----------------------------------------------------------------------
% Seleccion automatica de umbral
%----------------------------------------------------------------------

IN = imread('eye.jpg'); %modificar por el alumno
[filas, cols, canales] = size(IN);
imshow(IN);
	
%[c] Calcular el histograma de la imagen
   
[umbral, mu1, mu2] = mvThreshold(histo); %Completar la funcion histogram

umbral
mu1
mu2
figure(2);
showHisto(histo);


case 3 %Apartado 3

%----------------------------------------------------------------------
% Operacion de convolucion 2D
%----------------------------------------------------------------------

IN = imread('eye.jpg'); %modificar por el alumno 
[filas, cols, canales] = size(IN); 
imshow(IN); 
his = histogram(IN,1); 
 
%mask = [1 1 1; 1 8 1; 1 1 1]; 
mask =  ones(3,3).*(1/9);  %Modificar 
 
R = imConvolve(IN, mask); %Completar por el alumno 
 
R 
 
%Reajuste de la imagen 
%[c] Obtener el valor para tomar decision de reajustar o no el resultado 
maximo = max(max(R)) 
if (maximo>255)%[c] Insertar la codicion para reajustar 
  RR = imRemap(R); %Completar funcion imRemap 
  figure(1); 
  imshow(RR); 
  histog = histogram(RR,1); 
else 
  R=uint8(R); 
  figure(2); 
  imshow(R); 
   histog = histogram(R,1); 
end 
figure(3); 
showHisto(his); 
figure(4); 
showHisto(histog); 

     

  case 4 %Apartado 4
%----------------------------------------------------------------------
% Perfilado
%----------------------------------------------------------------------

IN = imread('eye.jpg'); %modificar por el alumno

out = hboost(IN, 5, 20); %modificar   

  case 5 %Apartado 5
%----------------------------------------------------------------------
% Realce y singularidades
%----------------------------------------------------------------------

IN = imread('objetos.jpg'); %modificar por el alumno

out = imBorder(IN); %Modificar





  case 6 %Apartado 6
%----------------------------------------------------------------------
% Diezmado
%----------------------------------------------------------------------

IN = imread('eye.jpg'); %modificar por el alumno
[filas, cols, canales] = size(IN);
imshow(IN);
title('Imagen original');

fil=imLPFilter(IN); %Este filtro paso de baja tiene una frecuencia de corte de 0.13

figure();
imshow(fil);
title('Imagen filtrada');


out=imDecimation(fil,3); %Modificar


figure();
imshow(out);
title('Diezmada y Filtrada');
print('DiezmadayFiltrada.jpg');

out1=imDecimation(IN,3);%Modificar
figure();
imshow(out1);
title('Diezamada Sin Filtrar');
print('DiezmadaSinFiltrada.jpg');






end  % Fin del programa










