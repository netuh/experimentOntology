/**
 */
package experimentOntology.impl;

import experimentOntology.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExperimentOntologyFactoryImpl extends EFactoryImpl implements ExperimentOntologyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExperimentOntologyFactory init() {
		try {
			ExperimentOntologyFactory theExperimentOntologyFactory = (ExperimentOntologyFactory)EPackage.Registry.INSTANCE.getEFactory(ExperimentOntologyPackage.eNS_URI);
			if (theExperimentOntologyFactory != null) {
				return theExperimentOntologyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExperimentOntologyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentOntologyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExperimentOntologyPackage.EXPERIMENTAL_STUDY: return createExperimentalStudy();
			case ExperimentOntologyPackage.EXPERIMENT: return createExperiment();
			case ExperimentOntologyPackage.REPLICATION: return createReplication();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentalStudy createExperimentalStudy() {
		ExperimentalStudyImpl experimentalStudy = new ExperimentalStudyImpl();
		return experimentalStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Experiment createExperiment() {
		ExperimentImpl experiment = new ExperimentImpl();
		return experiment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replication createReplication() {
		ReplicationImpl replication = new ReplicationImpl();
		return replication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExperimentOntologyPackage getExperimentOntologyPackage() {
		return (ExperimentOntologyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExperimentOntologyPackage getPackage() {
		return ExperimentOntologyPackage.eINSTANCE;
	}

} //ExperimentOntologyFactoryImpl
