namespace practica1Cliente
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.textBoxDni = new System.Windows.Forms.TextBox();
            this.buttonDni = new System.Windows.Forms.Button();
            this.labelDni = new System.Windows.Forms.Label();
            this.labelDniResult = new System.Windows.Forms.Label();
            this.textBoxLlave = new System.Windows.Forms.TextBox();
            this.label1 = new System.Windows.Forms.Label();
            this.labelIban = new System.Windows.Forms.Label();
            this.textBoxIban = new System.Windows.Forms.TextBox();
            this.buttonIban = new System.Windows.Forms.Button();
            this.labelIbanResult = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.textBoxCodigoPostal = new System.Windows.Forms.TextBox();
            this.labelPoblacion = new System.Windows.Forms.Label();
            this.labelProvincia = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.buttonCodigoPostal = new System.Windows.Forms.Button();
            this.label4 = new System.Windows.Forms.Label();
            this.label5 = new System.Windows.Forms.Label();
            this.label6 = new System.Windows.Forms.Label();
            this.label7 = new System.Windows.Forms.Label();
            this.textBoxRefPieza = new System.Windows.Forms.TextBox();
            this.textBoxIdProv = new System.Windows.Forms.TextBox();
            this.labelErrorSol = new System.Windows.Forms.Label();
            this.labelDisp = new System.Windows.Forms.Label();
            this.labelPrecio = new System.Windows.Forms.Label();
            this.buttonSolPres = new System.Windows.Forms.Button();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.labelFechaPres = new System.Windows.Forms.Label();
            this.labelIdCli = new System.Windows.Forms.Label();
            this.textBoxIdCli = new System.Windows.Forms.TextBox();
            this.textBoxRefProdGen = new System.Windows.Forms.TextBox();
            this.labelRefProd = new System.Windows.Forms.Label();
            this.labelCantProd = new System.Windows.Forms.Label();
            this.label8 = new System.Windows.Forms.Label();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.labelPrecioEuros = new System.Windows.Forms.Label();
            this.labelFechaMostrar = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // textBoxDni
            // 
            this.textBoxDni.Location = new System.Drawing.Point(68, 126);
            this.textBoxDni.Name = "textBoxDni";
            this.textBoxDni.Size = new System.Drawing.Size(100, 20);
            this.textBoxDni.TabIndex = 0;
            // 
            // buttonDni
            // 
            this.buttonDni.Location = new System.Drawing.Point(68, 153);
            this.buttonDni.Name = "buttonDni";
            this.buttonDni.Size = new System.Drawing.Size(75, 23);
            this.buttonDni.TabIndex = 1;
            this.buttonDni.Text = "Validar";
            this.buttonDni.UseVisualStyleBackColor = true;
            this.buttonDni.Click += new System.EventHandler(this.buttonDni_Click);
            // 
            // labelDni
            // 
            this.labelDni.AutoSize = true;
            this.labelDni.Location = new System.Drawing.Point(65, 101);
            this.labelDni.Name = "labelDni";
            this.labelDni.Size = new System.Drawing.Size(26, 13);
            this.labelDni.TabIndex = 2;
            this.labelDni.Text = "Dni:";
            // 
            // labelDniResult
            // 
            this.labelDniResult.AutoSize = true;
            this.labelDniResult.Location = new System.Drawing.Point(65, 182);
            this.labelDniResult.Name = "labelDniResult";
            this.labelDniResult.Size = new System.Drawing.Size(10, 13);
            this.labelDniResult.TabIndex = 3;
            this.labelDniResult.Text = ".";
            // 
            // textBoxLlave
            // 
            this.textBoxLlave.Location = new System.Drawing.Point(68, 31);
            this.textBoxLlave.Name = "textBoxLlave";
            this.textBoxLlave.Size = new System.Drawing.Size(100, 20);
            this.textBoxLlave.TabIndex = 4;
            this.textBoxLlave.TextChanged += new System.EventHandler(this.textBoxLlave_TextChanged);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(68, 12);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(37, 13);
            this.label1.TabIndex = 5;
            this.label1.Text = "Clave:";
            // 
            // labelIban
            // 
            this.labelIban.AutoSize = true;
            this.labelIban.Location = new System.Drawing.Point(181, 101);
            this.labelIban.Name = "labelIban";
            this.labelIban.Size = new System.Drawing.Size(31, 13);
            this.labelIban.TabIndex = 6;
            this.labelIban.Text = "Iban:";
            // 
            // textBoxIban
            // 
            this.textBoxIban.Location = new System.Drawing.Point(183, 126);
            this.textBoxIban.Name = "textBoxIban";
            this.textBoxIban.Size = new System.Drawing.Size(130, 20);
            this.textBoxIban.TabIndex = 7;
            // 
            // buttonIban
            // 
            this.buttonIban.Location = new System.Drawing.Point(183, 153);
            this.buttonIban.Name = "buttonIban";
            this.buttonIban.Size = new System.Drawing.Size(75, 23);
            this.buttonIban.TabIndex = 8;
            this.buttonIban.Text = "Validar";
            this.buttonIban.UseVisualStyleBackColor = true;
            this.buttonIban.Click += new System.EventHandler(this.buttonIban_Click);
            // 
            // labelIbanResult
            // 
            this.labelIbanResult.AutoSize = true;
            this.labelIbanResult.Location = new System.Drawing.Point(199, 183);
            this.labelIbanResult.Name = "labelIbanResult";
            this.labelIbanResult.Size = new System.Drawing.Size(10, 13);
            this.labelIbanResult.TabIndex = 9;
            this.labelIbanResult.Text = ".";
            this.labelIbanResult.Click += new System.EventHandler(this.labelIbanResult_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(68, 212);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(74, 13);
            this.label2.TabIndex = 10;
            this.label2.Text = "Código postal:";
            // 
            // textBoxCodigoPostal
            // 
            this.textBoxCodigoPostal.Location = new System.Drawing.Point(68, 238);
            this.textBoxCodigoPostal.Name = "textBoxCodigoPostal";
            this.textBoxCodigoPostal.Size = new System.Drawing.Size(100, 20);
            this.textBoxCodigoPostal.TabIndex = 11;
            // 
            // labelPoblacion
            // 
            this.labelPoblacion.AutoSize = true;
            this.labelPoblacion.Location = new System.Drawing.Point(70, 319);
            this.labelPoblacion.Name = "labelPoblacion";
            this.labelPoblacion.Size = new System.Drawing.Size(35, 13);
            this.labelPoblacion.TabIndex = 12;
            this.labelPoblacion.Text = "label3";
            // 
            // labelProvincia
            // 
            this.labelProvincia.AutoSize = true;
            this.labelProvincia.Location = new System.Drawing.Point(68, 343);
            this.labelProvincia.Name = "labelProvincia";
            this.labelProvincia.Size = new System.Drawing.Size(35, 13);
            this.labelProvincia.TabIndex = 13;
            this.labelProvincia.Text = "label3";
            this.labelProvincia.Click += new System.EventHandler(this.labelProvincia_Click);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.BackColor = System.Drawing.SystemColors.Control;
            this.label3.Location = new System.Drawing.Point(70, 292);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(35, 13);
            this.label3.TabIndex = 14;
            this.label3.Text = "label3";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // buttonCodigoPostal
            // 
            this.buttonCodigoPostal.Location = new System.Drawing.Point(68, 265);
            this.buttonCodigoPostal.Name = "buttonCodigoPostal";
            this.buttonCodigoPostal.Size = new System.Drawing.Size(75, 23);
            this.buttonCodigoPostal.TabIndex = 15;
            this.buttonCodigoPostal.Text = "Validar";
            this.buttonCodigoPostal.UseVisualStyleBackColor = true;
            this.buttonCodigoPostal.Click += new System.EventHandler(this.buttonCodigoPostal_Click);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(618, 31);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(109, 13);
            this.label4.TabIndex = 16;
            this.label4.Text = "Generar presupuesto:";
            this.label4.Click += new System.EventHandler(this.label4_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(371, 34);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(105, 13);
            this.label5.TabIndex = 17;
            this.label5.Text = "Solicitar presupuesto";
            this.label5.Click += new System.EventHandler(this.label5_Click);
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(374, 66);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(90, 13);
            this.label6.TabIndex = 18;
            this.label6.Text = "Referencia pieza:";
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(374, 114);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(70, 13);
            this.label7.TabIndex = 19;
            this.label7.Text = "Id proveedor:";
            // 
            // textBoxRefPieza
            // 
            this.textBoxRefPieza.Location = new System.Drawing.Point(377, 82);
            this.textBoxRefPieza.Name = "textBoxRefPieza";
            this.textBoxRefPieza.Size = new System.Drawing.Size(100, 20);
            this.textBoxRefPieza.TabIndex = 20;
            // 
            // textBoxIdProv
            // 
            this.textBoxIdProv.Location = new System.Drawing.Point(377, 141);
            this.textBoxIdProv.Name = "textBoxIdProv";
            this.textBoxIdProv.Size = new System.Drawing.Size(100, 20);
            this.textBoxIdProv.TabIndex = 21;
            // 
            // labelErrorSol
            // 
            this.labelErrorSol.AutoSize = true;
            this.labelErrorSol.Location = new System.Drawing.Point(383, 212);
            this.labelErrorSol.Name = "labelErrorSol";
            this.labelErrorSol.Size = new System.Drawing.Size(28, 13);
            this.labelErrorSol.TabIndex = 22;
            this.labelErrorSol.Text = "error";
            // 
            // labelDisp
            // 
            this.labelDisp.AutoSize = true;
            this.labelDisp.Location = new System.Drawing.Point(383, 306);
            this.labelDisp.Name = "labelDisp";
            this.labelDisp.Size = new System.Drawing.Size(56, 13);
            this.labelDisp.TabIndex = 23;
            this.labelDisp.Text = "fecha disp";
            // 
            // labelPrecio
            // 
            this.labelPrecio.AutoSize = true;
            this.labelPrecio.Location = new System.Drawing.Point(383, 265);
            this.labelPrecio.Name = "labelPrecio";
            this.labelPrecio.Size = new System.Drawing.Size(36, 13);
            this.labelPrecio.TabIndex = 24;
            this.labelPrecio.Text = "precio";
            // 
            // buttonSolPres
            // 
            this.buttonSolPres.Location = new System.Drawing.Point(377, 171);
            this.buttonSolPres.Name = "buttonSolPres";
            this.buttonSolPres.Size = new System.Drawing.Size(75, 23);
            this.buttonSolPres.TabIndex = 25;
            this.buttonSolPres.Text = "Solicitar";
            this.buttonSolPres.UseVisualStyleBackColor = true;
            this.buttonSolPres.Click += new System.EventHandler(this.buttonSolPres_Click);
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.Location = new System.Drawing.Point(612, 82);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(200, 20);
            this.dateTimePicker1.TabIndex = 26;
            // 
            // labelFechaPres
            // 
            this.labelFechaPres.AutoSize = true;
            this.labelFechaPres.Location = new System.Drawing.Point(612, 63);
            this.labelFechaPres.Name = "labelFechaPres";
            this.labelFechaPres.Size = new System.Drawing.Size(101, 13);
            this.labelFechaPres.TabIndex = 27;
            this.labelFechaPres.Text = "Fecha presupuesto:";
            // 
            // labelIdCli
            // 
            this.labelIdCli.AutoSize = true;
            this.labelIdCli.Location = new System.Drawing.Point(615, 114);
            this.labelIdCli.Name = "labelIdCli";
            this.labelIdCli.Size = new System.Drawing.Size(53, 13);
            this.labelIdCli.TabIndex = 28;
            this.labelIdCli.Text = "Id cliente:";
            // 
            // textBoxIdCli
            // 
            this.textBoxIdCli.Location = new System.Drawing.Point(612, 141);
            this.textBoxIdCli.Name = "textBoxIdCli";
            this.textBoxIdCli.Size = new System.Drawing.Size(56, 20);
            this.textBoxIdCli.TabIndex = 29;
            // 
            // textBoxRefProdGen
            // 
            this.textBoxRefProdGen.Location = new System.Drawing.Point(618, 229);
            this.textBoxRefProdGen.Name = "textBoxRefProdGen";
            this.textBoxRefProdGen.Size = new System.Drawing.Size(100, 20);
            this.textBoxRefProdGen.TabIndex = 30;
            // 
            // labelRefProd
            // 
            this.labelRefProd.AutoSize = true;
            this.labelRefProd.Location = new System.Drawing.Point(618, 203);
            this.labelRefProd.Name = "labelRefProd";
            this.labelRefProd.Size = new System.Drawing.Size(60, 13);
            this.labelRefProd.TabIndex = 31;
            this.labelRefProd.Text = "Referenca:";
            // 
            // labelCantProd
            // 
            this.labelCantProd.AutoSize = true;
            this.labelCantProd.Location = new System.Drawing.Point(732, 203);
            this.labelCantProd.Name = "labelCantProd";
            this.labelCantProd.Size = new System.Drawing.Size(52, 13);
            this.labelCantProd.TabIndex = 32;
            this.labelCantProd.Text = "Cantidad:";
            // 
            // label8
            // 
            this.label8.AutoSize = true;
            this.label8.Location = new System.Drawing.Point(618, 181);
            this.label8.Name = "label8";
            this.label8.Size = new System.Drawing.Size(53, 13);
            this.label8.TabIndex = 33;
            this.label8.Text = "Producto:";
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(735, 229);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(37, 20);
            this.textBox1.TabIndex = 34;
            // 
            // labelPrecioEuros
            // 
            this.labelPrecioEuros.AutoSize = true;
            this.labelPrecioEuros.Location = new System.Drawing.Point(383, 252);
            this.labelPrecioEuros.Name = "labelPrecioEuros";
            this.labelPrecioEuros.Size = new System.Drawing.Size(52, 13);
            this.labelPrecioEuros.TabIndex = 35;
            this.labelPrecioEuros.Text = "Precio(€):";
            // 
            // labelFechaMostrar
            // 
            this.labelFechaMostrar.AutoSize = true;
            this.labelFechaMostrar.Location = new System.Drawing.Point(383, 292);
            this.labelFechaMostrar.Name = "labelFechaMostrar";
            this.labelFechaMostrar.Size = new System.Drawing.Size(106, 13);
            this.labelFechaMostrar.TabIndex = 36;
            this.labelFechaMostrar.Text = "Fecha disponibilidad:";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(834, 505);
            this.Controls.Add(this.labelFechaMostrar);
            this.Controls.Add(this.labelPrecioEuros);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.label8);
            this.Controls.Add(this.labelCantProd);
            this.Controls.Add(this.labelRefProd);
            this.Controls.Add(this.textBoxRefProdGen);
            this.Controls.Add(this.textBoxIdCli);
            this.Controls.Add(this.labelIdCli);
            this.Controls.Add(this.labelFechaPres);
            this.Controls.Add(this.dateTimePicker1);
            this.Controls.Add(this.buttonSolPres);
            this.Controls.Add(this.labelPrecio);
            this.Controls.Add(this.labelDisp);
            this.Controls.Add(this.labelErrorSol);
            this.Controls.Add(this.textBoxIdProv);
            this.Controls.Add(this.textBoxRefPieza);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.buttonCodigoPostal);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.labelProvincia);
            this.Controls.Add(this.labelPoblacion);
            this.Controls.Add(this.textBoxCodigoPostal);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.labelIbanResult);
            this.Controls.Add(this.buttonIban);
            this.Controls.Add(this.textBoxIban);
            this.Controls.Add(this.labelIban);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.textBoxLlave);
            this.Controls.Add(this.labelDniResult);
            this.Controls.Add(this.labelDni);
            this.Controls.Add(this.buttonDni);
            this.Controls.Add(this.textBoxDni);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBoxDni;
        private System.Windows.Forms.Button buttonDni;
        private System.Windows.Forms.Label labelDni;
        private System.Windows.Forms.Label labelDniResult;
        private System.Windows.Forms.TextBox textBoxLlave;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label labelIban;
        private System.Windows.Forms.TextBox textBoxIban;
        private System.Windows.Forms.Button buttonIban;
        private System.Windows.Forms.Label labelIbanResult;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox textBoxCodigoPostal;
        private System.Windows.Forms.Label labelPoblacion;
        private System.Windows.Forms.Label labelProvincia;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button buttonCodigoPostal;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox textBoxRefPieza;
        private System.Windows.Forms.TextBox textBoxIdProv;
        private System.Windows.Forms.Label labelErrorSol;
        private System.Windows.Forms.Label labelDisp;
        private System.Windows.Forms.Label labelPrecio;
        private System.Windows.Forms.Button buttonSolPres;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.Label labelFechaPres;
        private System.Windows.Forms.Label labelIdCli;
        private System.Windows.Forms.TextBox textBoxIdCli;
        private System.Windows.Forms.TextBox textBoxRefProdGen;
        private System.Windows.Forms.Label labelRefProd;
        private System.Windows.Forms.Label labelCantProd;
        private System.Windows.Forms.Label label8;
        private System.Windows.Forms.TextBox textBox1;
        private System.Windows.Forms.Label labelPrecioEuros;
        private System.Windows.Forms.Label labelFechaMostrar;
    }
}

