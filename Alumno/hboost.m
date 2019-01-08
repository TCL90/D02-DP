%Función hboost
%Argumentos de entrada
% image <- matriz bidimensional de la imagen 
% N <- orden del filtro (tamaño de la matriz high boost, número impar)
% a <- Factor de amplificación (se recomienda a>10)
% out -> Imagen resultante

%Testado para N=3, a=9, eyes.jpg
%	      N=5, a=20, eyes.jpg

function out = hboost(image, N, a)

if nargin <3
	error('Faltan argumentos');
end
if rem(N,2)==0 || N==1
	error('N debe ser impar mayor que 1');
end

mask = ones(N:N).*(-1);%[c] Definir mascara todo a -1 
c=fix(N/2)+1; % Calculamos el centro de la mascara 
A= (N*N)-1+a;%[c] Calcular A como el cuadrado de N menos 1 mas a 
mask(c,c) = A ; 
 
out1 = imConvolve(image, mask); 
out = imRemap(out1);

figure()
imshow(image);
figure()
imshow(out);

endfunction
