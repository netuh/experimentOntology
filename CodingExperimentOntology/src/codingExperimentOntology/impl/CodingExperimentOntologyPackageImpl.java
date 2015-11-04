/**
 */
package codingExperimentOntology.impl;

import codingExperimentOntology.CodingExperimentOntologyFactory;
import codingExperimentOntology.CodingExperimentOntologyPackage;
import codingExperimentOntology.CodingExperimentalStudy;

import codingExperimentOntology.apparatus.NewPackage4Package;

import codingExperimentOntology.apparatus.impl.NewPackage4PackageImpl;

import codingExperimentOntology.tasks.NewPackage2Package;

import codingExperimentOntology.tasks.impl.NewPackage2PackageImpl;

import codingExperimentOntology.threats.NewPackage3Package;

import codingExperimentOntology.threats.impl.NewPackage3PackageImpl;

import codingExperimentOntology.variables.NewPackage1Package;

import codingExperimentOntology.variables.impl.NewPackage1PackageImpl;

import experimentOntology.ExperimentOntologyPackage;

import experimentOntology.description.DescriptionPackage;

import experimentOntology.description.gqm.GqmPackage;

import experimentOntology.description.gqm.impl.GqmPackageImpl;

import experimentOntology.description.impl.DescriptionPackageImpl;

import experimentOntology.impl.ExperimentOntologyPackageImpl;

import experimentOntology.operation.OperationPackage;

import experimentOntology.operation.impl.OperationPackageImpl;

import experimentOntology.operation.taskCompositionFramework.TaskCompositionFrameworkPackage;

import experimentOntology.operation.taskCompositionFramework.impl.TaskCompositionFrameworkPackageImpl;

import experimentOntology.planning.PlanningPackage;

import experimentOntology.planning.designOfExperiment.DesignOfExperimentPackage;

import experimentOntology.planning.designOfExperiment.impl.DesignOfExperimentPackageImpl;

import experimentOntology.planning.impl.PlanningPackageImpl;

import experimentOntology.planning.sampling.SamplingPackage;

import experimentOntology.planning.sampling.impl.SamplingPackageImpl;

import experimentOntology.planning.threats.ThreatsPackage;

import experimentOntology.planning.threats.impl.ThreatsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodingExperimentOntologyPackageImpl extends EPackageImpl implements CodingExperimentOntologyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codingExperimentalStudyEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see codingExperimentOntology.CodingExperimentOntologyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodingExperimentOntologyPackageImpl() {
		super(eNS_URI, CodingExperimentOntologyFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CodingExperimentOntologyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodingExperimentOntologyPackage init() {
		if (isInited) return (CodingExperimentOntologyPackage)EPackage.Registry.INSTANCE.getEPackage(CodingExperimentOntologyPackage.eNS_URI);

		// Obtain or create and register package
		CodingExperimentOntologyPackageImpl theCodingExperimentOntologyPackage = (CodingExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CodingExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CodingExperimentOntologyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		NewPackage1PackageImpl theNewPackage1Package = (NewPackage1PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) instanceof NewPackage1PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI) : NewPackage1Package.eINSTANCE);
		NewPackage2PackageImpl theNewPackage2Package = (NewPackage2PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) instanceof NewPackage2PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI) : NewPackage2Package.eINSTANCE);
		NewPackage3PackageImpl theNewPackage3Package = (NewPackage3PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) instanceof NewPackage3PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI) : NewPackage3Package.eINSTANCE);
		NewPackage4PackageImpl theNewPackage4Package = (NewPackage4PackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) instanceof NewPackage4PackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI) : NewPackage4Package.eINSTANCE);
		ExperimentOntologyPackageImpl theExperimentOntologyPackage = (ExperimentOntologyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) instanceof ExperimentOntologyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI) : ExperimentOntologyPackage.eINSTANCE);
		DescriptionPackageImpl theDescriptionPackage = (DescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) instanceof DescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DescriptionPackage.eNS_URI) : DescriptionPackage.eINSTANCE);
		GqmPackageImpl theGqmPackage = (GqmPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) instanceof GqmPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GqmPackage.eNS_URI) : GqmPackage.eINSTANCE);
		PlanningPackageImpl thePlanningPackage = (PlanningPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) instanceof PlanningPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlanningPackage.eNS_URI) : PlanningPackage.eINSTANCE);
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		SamplingPackageImpl theSamplingPackage = (SamplingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) instanceof SamplingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SamplingPackage.eNS_URI) : SamplingPackage.eINSTANCE);
		DesignOfExperimentPackageImpl theDesignOfExperimentPackage = (DesignOfExperimentPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) instanceof DesignOfExperimentPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesignOfExperimentPackage.eNS_URI) : DesignOfExperimentPackage.eINSTANCE);
		OperationPackageImpl theOperationPackage = (OperationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) instanceof OperationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperationPackage.eNS_URI) : OperationPackage.eINSTANCE);
		TaskCompositionFrameworkPackageImpl theTaskCompositionFrameworkPackage = (TaskCompositionFrameworkPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) instanceof TaskCompositionFrameworkPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TaskCompositionFrameworkPackage.eNS_URI) : TaskCompositionFrameworkPackage.eINSTANCE);

		// Create package meta-data objects
		theCodingExperimentOntologyPackage.createPackageContents();
		theNewPackage1Package.createPackageContents();
		theNewPackage2Package.createPackageContents();
		theNewPackage3Package.createPackageContents();
		theNewPackage4Package.createPackageContents();
		theExperimentOntologyPackage.createPackageContents();
		theDescriptionPackage.createPackageContents();
		theGqmPackage.createPackageContents();
		thePlanningPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theSamplingPackage.createPackageContents();
		theDesignOfExperimentPackage.createPackageContents();
		theOperationPackage.createPackageContents();
		theTaskCompositionFrameworkPackage.createPackageContents();

		// Initialize created meta-data
		theCodingExperimentOntologyPackage.initializePackageContents();
		theNewPackage1Package.initializePackageContents();
		theNewPackage2Package.initializePackageContents();
		theNewPackage3Package.initializePackageContents();
		theNewPackage4Package.initializePackageContents();
		theExperimentOntologyPackage.initializePackageContents();
		theDescriptionPackage.initializePackageContents();
		theGqmPackage.initializePackageContents();
		thePlanningPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theSamplingPackage.initializePackageContents();
		theDesignOfExperimentPackage.initializePackageContents();
		theOperationPackage.initializePackageContents();
		theTaskCompositionFrameworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodingExperimentOntologyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodingExperimentOntologyPackage.eNS_URI, theCodingExperimentOntologyPackage);
		return theCodingExperimentOntologyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodingExperimentalStudy() {
		return codingExperimentalStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingExperimentOntologyFactory getCodingExperimentOntologyFactory() {
		return (CodingExperimentOntologyFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		codingExperimentalStudyEClass = createEClass(CODING_EXPERIMENTAL_STUDY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NewPackage1Package theNewPackage1Package = (NewPackage1Package)EPackage.Registry.INSTANCE.getEPackage(NewPackage1Package.eNS_URI);
		NewPackage2Package theNewPackage2Package = (NewPackage2Package)EPackage.Registry.INSTANCE.getEPackage(NewPackage2Package.eNS_URI);
		NewPackage3Package theNewPackage3Package = (NewPackage3Package)EPackage.Registry.INSTANCE.getEPackage(NewPackage3Package.eNS_URI);
		NewPackage4Package theNewPackage4Package = (NewPackage4Package)EPackage.Registry.INSTANCE.getEPackage(NewPackage4Package.eNS_URI);
		ExperimentOntologyPackage theExperimentOntologyPackage = (ExperimentOntologyPackage)EPackage.Registry.INSTANCE.getEPackage(ExperimentOntologyPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theNewPackage1Package);
		getESubpackages().add(theNewPackage2Package);
		getESubpackages().add(theNewPackage3Package);
		getESubpackages().add(theNewPackage4Package);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codingExperimentalStudyEClass.getESuperTypes().add(theExperimentOntologyPackage.getExperimentalStudy());

		// Initialize classes, features, and operations; add parameters
		initEClass(codingExperimentalStudyEClass, CodingExperimentalStudy.class, "CodingExperimentalStudy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CodingExperimentOntologyPackageImpl
