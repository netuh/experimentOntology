/**
 */
package codingExperimentOntology.apparatus.impl;

import codingExperimentOntology.apparatus.CodignApparatus;
import codingExperimentOntology.apparatus.CodingInstrument;
import codingExperimentOntology.apparatus.NewPackage4Package;
import codingExperimentOntology.apparatus.Question;
import codingExperimentOntology.apparatus.Questionnaire;
import codingExperimentOntology.apparatus.QuestionnaireByProcess;
import codingExperimentOntology.apparatus.QuestionnarieAllocation;

import experimentOntology.planning.Apparatus;
import experimentOntology.planning.Artifact;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire By Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.impl.QuestionnaireByProcessImpl#getQuestions <em>Questions</em>}</li>
 *   <li>{@link codingExperimentOntology.apparatus.impl.QuestionnaireByProcessImpl#getAllocation <em>Allocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireByProcessImpl extends ProcessRelatedImpl implements QuestionnaireByProcess {
	/**
	 * The cached value of the '{@link #getQuestions() <em>Questions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> questions;

	/**
	 * The default value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final QuestionnarieAllocation ALLOCATION_EDEFAULT = QuestionnarieAllocation.BEFORE;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected QuestionnarieAllocation allocation = ALLOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireByProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage4Package.Literals.QUESTIONNAIRE_BY_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<Question>(Question.class, this, NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__QUESTIONS);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnarieAllocation getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocation(QuestionnarieAllocation newAllocation) {
		QuestionnarieAllocation oldAllocation = allocation;
		allocation = newAllocation == null ? ALLOCATION_EDEFAULT : newAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__ALLOCATION, oldAllocation, allocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__QUESTIONS:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__QUESTIONS:
				return getQuestions();
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__ALLOCATION:
				return getAllocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__QUESTIONS:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends Question>)newValue);
				return;
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__ALLOCATION:
				setAllocation((QuestionnarieAllocation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__QUESTIONS:
				getQuestions().clear();
				return;
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__ALLOCATION:
				setAllocation(ALLOCATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__QUESTIONS:
				return questions != null && !questions.isEmpty();
			case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__ALLOCATION:
				return allocation != ALLOCATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Apparatus.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CodignApparatus.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Artifact.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CodingInstrument.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Questionnaire.class) {
			switch (derivedFeatureID) {
				case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__QUESTIONS: return NewPackage4Package.QUESTIONNAIRE__QUESTIONS;
				case NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__ALLOCATION: return NewPackage4Package.QUESTIONNAIRE__ALLOCATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Apparatus.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CodignApparatus.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Artifact.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CodingInstrument.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Questionnaire.class) {
			switch (baseFeatureID) {
				case NewPackage4Package.QUESTIONNAIRE__QUESTIONS: return NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__QUESTIONS;
				case NewPackage4Package.QUESTIONNAIRE__ALLOCATION: return NewPackage4Package.QUESTIONNAIRE_BY_PROCESS__ALLOCATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (allocation: ");
		result.append(allocation);
		result.append(')');
		return result.toString();
	}

} //QuestionnaireByProcessImpl
