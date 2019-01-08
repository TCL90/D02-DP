function out = imBorder(image);

%M�scaras de Sobel para la estimaci�n del gradiente
SobelGx = [-1 -2 -1; 0 0 0; 1 2 1];
SobelGy = [-1 0 1; -2 0 2; -1 0 1];


%[c] Calcular el gradiente horizontal

Gx = imConvolve(image, SobelGx);

%[c] Calcular el gradiente vertical

Gy = imConvolve(image, SobelGy); 
 
ModGradiente = sqrt(Gx.^2 + Gy.^2);  %M�dulo del gradiente 
out = imRemap(ModGradiente);  %Reajustar 
 
figure(); 
imshow(image); 
figure(); 
imshow(out); 
 
endfunction 
